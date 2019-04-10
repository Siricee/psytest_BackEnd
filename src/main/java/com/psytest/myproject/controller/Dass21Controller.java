package com.psytest.myproject.controller;

import com.psytest.myproject.bean.Dass21;
import com.psytest.myproject.bean.Dass21Example;
import com.psytest.myproject.service.Dass21Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/dass21")
public class Dass21Controller {
    @Resource
    private Dass21Service dass21Service;

    /**
     * 获取所有用户dass21答题历史
     * @param request
     * @return
     */
    @RequestMapping("/history_list")
    @ResponseBody
    List<Dass21> selectByExample(HttpServletRequest request){
        return dass21Service.selectByExample(new Dass21Example());
    }

    /**
     * 获取某个用户的dass21提交历史
     * @param request
     * @return
     */
    @RequestMapping("/history_list/user")
    @ResponseBody
    List<Dass21> selectHistoryByUserId(HttpServletRequest request){
        Dass21Example dass21Example = new Dass21Example();
        Dass21Example.Criteria dass21criteria = dass21Example.createCriteria();
        dass21criteria.andUseridEqualTo(Integer.parseInt(request.getParameter("userid")));

        return dass21Service.selectByExample(dass21Example);
    }

    /**
     * 根据记录的主键删除某条dass21记录
     * @param request
     * @return
     */
    @RequestMapping("/history_list/delete")
    @ResponseBody
    public int deleteByPrimaryKey(HttpServletRequest request){
        int recordId = Integer.parseInt(request.getParameter("id"));
        return dass21Service.deleteByPrimaryKey(recordId);
    }

    /**
     * 提交当前问卷记录
     *
     * 各项分数 = 三个因子总分*2
     * @param request
     * @return
     */
    @PostMapping("/commit")
    @ResponseBody
    public int insertSelective(HttpServletRequest request) {
        Dass21 dass21 = new Dass21();

        Date date = new Date(); // 注意是java.util.Date类
        Timestamp timestamp = new Timestamp(date.getTime());
//        System.out.println(timestamp); // 2019-04-07 20:08:01.055

        dass21.setUserid(Integer.parseInt(request.getParameter("userid")));
        dass21.setTime(timestamp);
        dass21.setAnswer1(Integer.parseInt(request.getParameter("answer1")));
        dass21.setAnswer2(Integer.parseInt(request.getParameter("answer2")));
        dass21.setAnswer3(Integer.parseInt(request.getParameter("answer3")));
        dass21.setAnswer4(Integer.parseInt(request.getParameter("answer4")));
        dass21.setAnswer5(Integer.parseInt(request.getParameter("answer5")));
        dass21.setAnswer6(Integer.parseInt(request.getParameter("answer6")));
        dass21.setAnswer7(Integer.parseInt(request.getParameter("answer7")));
        dass21.setAnswer8(Integer.parseInt(request.getParameter("answer8")));
        dass21.setAnswer9(Integer.parseInt(request.getParameter("answer9")));
        dass21.setAnswer10(Integer.parseInt(request.getParameter("answer10")));
        dass21.setAnswer11(Integer.parseInt(request.getParameter("answer11")));
        dass21.setAnswer12(Integer.parseInt(request.getParameter("answer12")));
        dass21.setAnswer13(Integer.parseInt(request.getParameter("answer13")));
        dass21.setAnswer14(Integer.parseInt(request.getParameter("answer14")));
        dass21.setAnswer15(Integer.parseInt(request.getParameter("answer15")));
        dass21.setAnswer16(Integer.parseInt(request.getParameter("answer16")));
        dass21.setAnswer17(Integer.parseInt(request.getParameter("answer17")));
        dass21.setAnswer18(Integer.parseInt(request.getParameter("answer18")));
        dass21.setAnswer19(Integer.parseInt(request.getParameter("answer19")));
        dass21.setAnswer20(Integer.parseInt(request.getParameter("answer20")));
        dass21.setAnswer21(Integer.parseInt(request.getParameter("answer21")));

//        dass21.setUserid(2);
//        dass21.setTime(timestamp);
//        dass21.setAnswer1(2);
//        dass21.setAnswer2(1);
//        dass21.setAnswer3(3);
//        dass21.setAnswer4(0);
//        dass21.setAnswer5(1);
//        dass21.setAnswer6(2);
//        dass21.setAnswer7(3);
//        dass21.setAnswer8(1);
//        dass21.setAnswer9(1);
//        dass21.setAnswer10(0);
//        dass21.setAnswer11(1);
//        dass21.setAnswer12(2);
//        dass21.setAnswer13(3);
//        dass21.setAnswer14(1);
//        dass21.setAnswer15(2);
//        dass21.setAnswer16(2);
//        dass21.setAnswer17(3);
//        dass21.setAnswer18(0);
//        dass21.setAnswer19(1);
//        dass21.setAnswer20(3);
//        dass21.setAnswer21(2);

        dass21.setStress((dass21.getAnswer1() + dass21.getAnswer6() + dass21.getAnswer8() + dass21.getAnswer11() + dass21.getAnswer12() + dass21.getAnswer14() + dass21.getAnswer18()) * 2);
        dass21.setAnxiety((dass21.getAnswer2() + dass21.getAnswer4() + dass21.getAnswer7() + dass21.getAnswer9() + dass21.getAnswer15() + dass21.getAnswer19() + dass21.getAnswer20()) * 2);
        dass21.setDepression((dass21.getAnswer3() + dass21.getAnswer5() + dass21.getAnswer10() + dass21.getAnswer13() + dass21.getAnswer16() + dass21.getAnswer17() + dass21.getAnswer21()) * 2);

        return dass21Service.insertSelective(dass21);
    }

}
