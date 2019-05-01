package com.psytest.myproject.controller;

import com.psytest.myproject.bean.Novack;
import com.psytest.myproject.bean.NovackExample;
import com.psytest.myproject.service.NovackService;
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
@RequestMapping("/novack")
public class NovackController {
    @Resource
    private NovackService novackService;

    /**
     * 获取所有用户novack答题历史
     *
     * @param request
     * @return
     */
    @RequestMapping("/history_list")
    @ResponseBody
    List<Novack> selectByExample(HttpServletRequest request) {
        return novackService.selectByExample(new NovackExample());
    }

    /**
     * 获取某个用户的novack提交历史
     *
     * @param request
     * @return
     */
    @RequestMapping("/history_list/user")
    @ResponseBody
    List<Novack> selectHistoryByUserId(HttpServletRequest request) {
        NovackExample novackExample = new NovackExample();
        NovackExample.Criteria novackExampleCriteria = novackExample.createCriteria();
        novackExampleCriteria.andUseridEqualTo(Integer.parseInt(request.getParameter("userid")));

        return novackService.selectByExample(novackExample);
    }

    /**
     * 根据记录的主键删除某条novack记录
     * @param request
     * @return
     */
    @RequestMapping("/history_list/delete")
    @ResponseBody
    public int deleteByPrimaryKey(HttpServletRequest request){
        int recordId = Integer.parseInt(request.getParameter("id"));
        return novackService.deleteByPrimaryKey(recordId);
    }

    /**
     * 提交当前问卷记录
     *
     * 总分 = 标准分（求和）*1.25 取整
     * @param request
     * @return
     */
    @PostMapping("/commit")
    @ResponseBody
    public int insertSelective(HttpServletRequest request) {
        Novack novack = new Novack();
        
        Date date = new Date(); // 注意是java.util.Date类
        Timestamp timestamp = new Timestamp(date.getTime());
//        System.out.println(timestamp); // 2019-04-07 20:08:01.055

        novack.setUserid(Integer.parseInt(request.getParameter("userid")));
        novack.setTime(timestamp);
        novack.setAnswer1(Integer.parseInt(request.getParameter("answer1")));
        novack.setAnswer2(Integer.parseInt(request.getParameter("answer2")));
        novack.setAnswer3(Integer.parseInt(request.getParameter("answer3")));
        novack.setAnswer4(Integer.parseInt(request.getParameter("answer4")));
        novack.setAnswer5(Integer.parseInt(request.getParameter("answer5")));
        novack.setAnswer6(Integer.parseInt(request.getParameter("answer6")));
        novack.setAnswer7(Integer.parseInt(request.getParameter("answer7")));
        novack.setAnswer8(Integer.parseInt(request.getParameter("answer8")));
        novack.setAnswer9(Integer.parseInt(request.getParameter("answer9")));
        novack.setAnswer10(Integer.parseInt(request.getParameter("answer10")));
        novack.setAnswer11(Integer.parseInt(request.getParameter("answer11")));
        novack.setAnswer12(Integer.parseInt(request.getParameter("answer12")));
        novack.setAnswer13(Integer.parseInt(request.getParameter("answer13")));
        novack.setAnswer14(Integer.parseInt(request.getParameter("answer14")));
        novack.setAnswer15(Integer.parseInt(request.getParameter("answer15")));
        novack.setAnswer16(Integer.parseInt(request.getParameter("answer16")));
        novack.setAnswer17(Integer.parseInt(request.getParameter("answer17")));
        novack.setAnswer18(Integer.parseInt(request.getParameter("answer18")));
        novack.setAnswer19(Integer.parseInt(request.getParameter("answer19")));
        novack.setAnswer20(Integer.parseInt(request.getParameter("answer20")));
        novack.setAnswer21(Integer.parseInt(request.getParameter("answer21")));
        novack.setAnswer22(Integer.parseInt(request.getParameter("answer22")));
        novack.setAnswer23(Integer.parseInt(request.getParameter("answer23")));
        novack.setAnswer24(Integer.parseInt(request.getParameter("answer24")));
        novack.setAnswer25(Integer.parseInt(request.getParameter("answer25")));

        novack.setSum(novack.getAnswer1()+novack.getAnswer2()+novack.getAnswer3()+novack.getAnswer4()+novack.getAnswer5()+novack.getAnswer6()+novack.getAnswer7()+novack.getAnswer8()+novack.getAnswer9()+novack.getAnswer10()+novack.getAnswer11()+novack.getAnswer12()+novack.getAnswer13()+novack.getAnswer14()+novack.getAnswer15()+novack.getAnswer16()+novack.getAnswer17()+novack.getAnswer18()+novack.getAnswer19()+novack.getAnswer20()+novack.getAnswer21()+novack.getAnswer22()+novack.getAnswer23()+novack.getAnswer24()+novack.getAnswer25());

        return novackService.insertSelective(novack);
    }

    /**
     *
     * @param request
     * @return
     */
    @RequestMapping("/history_list_detail")
    @ResponseBody
    List<Novack> getRecordWithUserinfo(HttpServletRequest request){
        return novackService.getRecordWithUserinfo();
    }
}
