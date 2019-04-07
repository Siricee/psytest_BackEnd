package com.psytest.myproject.controller;

import com.psytest.myproject.bean.Sas;
import com.psytest.myproject.bean.SasExample;
import com.psytest.myproject.service.SasService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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

}
