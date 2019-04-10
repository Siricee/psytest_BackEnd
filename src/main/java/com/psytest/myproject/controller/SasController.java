package com.psytest.myproject.controller;

import com.psytest.myproject.bean.Sas;
import com.psytest.myproject.bean.SasExample;
import com.psytest.myproject.service.SasService;
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
@RequestMapping("/sas")
public class SasController {
    @Resource
    private SasService sasService;

    /**
     * 获取所有用户sas答题历史
     * @param request
     * @return
     */
    @RequestMapping("/history_list")
    @ResponseBody
    List<Sas> selectByExample(HttpServletRequest request){
        return sasService.selectByExample(new SasExample());
    }
    /**
     * 获取某个用户的sas提交历史
     * @param request
     * @return
     */
    @RequestMapping("/history_list/user")
    @ResponseBody
    List<Sas> selectHistoryByUserId(HttpServletRequest request){
        SasExample sasExample = new SasExample();
        SasExample.Criteria sascriteria = sasExample.createCriteria();
        sascriteria.andUseridEqualTo(Integer.parseInt(request.getParameter("userid")));

        return sasService.selectByExample(sasExample);
    }
    /**
     * 根据记录的主键删除某条sas记录
     * @param request
     * @return
     */
    @RequestMapping("/history_list/delete")
    @ResponseBody
    public int deleteByPrimaryKey(HttpServletRequest request){
        int recordId = Integer.parseInt(request.getParameter("id"));
        return sasService.deleteByPrimaryKey(recordId);
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
        Sas sas = new Sas();

        Date date = new Date(); // 注意是java.util.Date类
        Timestamp timestamp = new Timestamp(date.getTime());
//        System.out.println(timestamp); // 2019-04-07 20:08:01.055

        sas.setUserid(Integer.parseInt(request.getParameter("userid")));
        sas.setTime(timestamp);
        sas.setAnswer1(Integer.parseInt(request.getParameter("answer1")));
        sas.setAnswer2(Integer.parseInt(request.getParameter("answer2")));
        sas.setAnswer3(Integer.parseInt(request.getParameter("answer3")));
        sas.setAnswer4(Integer.parseInt(request.getParameter("answer4")));
        sas.setAnswer5(Integer.parseInt(request.getParameter("answer5")));
        sas.setAnswer6(Integer.parseInt(request.getParameter("answer6")));
        sas.setAnswer7(Integer.parseInt(request.getParameter("answer7")));
        sas.setAnswer8(Integer.parseInt(request.getParameter("answer8")));
        sas.setAnswer9(Integer.parseInt(request.getParameter("answer9")));
        sas.setAnswer10(Integer.parseInt(request.getParameter("answer10")));
        sas.setAnswer11(Integer.parseInt(request.getParameter("answer11")));
        sas.setAnswer12(Integer.parseInt(request.getParameter("answer12")));
        sas.setAnswer13(Integer.parseInt(request.getParameter("answer13")));
        sas.setAnswer14(Integer.parseInt(request.getParameter("answer14")));
        sas.setAnswer15(Integer.parseInt(request.getParameter("answer15")));
        sas.setAnswer16(Integer.parseInt(request.getParameter("answer16")));
        sas.setAnswer17(Integer.parseInt(request.getParameter("answer17")));
        sas.setAnswer18(Integer.parseInt(request.getParameter("answer18")));
        sas.setAnswer19(Integer.parseInt(request.getParameter("answer19")));
        sas.setAnswer20(Integer.parseInt(request.getParameter("answer20")));
        double sum = (sas.getAnswer1()+sas.getAnswer2()+sas.getAnswer3()+sas.getAnswer4()+sas.getAnswer5()+sas.getAnswer6()+sas.getAnswer7()+sas.getAnswer8()+sas.getAnswer9()+sas.getAnswer10()+sas.getAnswer11()+sas.getAnswer12()+sas.getAnswer13()+sas.getAnswer14()+sas.getAnswer15()+sas.getAnswer16()+sas.getAnswer17()+sas.getAnswer18()+sas.getAnswer19()+sas.getAnswer20())*1.25;
        sas.setSum((int)Math.round(sum));

        return sasService.insertSelective(sas);
    }
}
