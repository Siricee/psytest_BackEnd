package com.psytest.myproject.controller;

import com.psytest.myproject.bean.Admin;
import com.psytest.myproject.bean.AdminExample;
import com.psytest.myproject.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    /**
     * POST
     * 业务主要方法
     *
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public Admin login(HttpServletRequest request) {
        AdminExample adminExample = new AdminExample();
//        System.out.println(request.getParameter("username"));
//        System.out.println(request.getParameter("password"));
        AdminExample.Criteria adminExampleCriteria = adminExample.createCriteria();
        adminExampleCriteria.andUsernameEqualTo(request.getParameter("username"));
        adminExampleCriteria.andPasswordEqualTo(request.getParameter("password"));
        List<Admin> result = adminService.selectByExample(adminExample);
        if (!result.isEmpty()) {
            //Admin admin = result.get(0);
            return result.get(0);
        } else {
            return null;
        }
    }


    /**
     * Administrator业务方法
     * 列出所有admin用户数据
     *
     * @param request
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> selectByExample(HttpServletRequest request) {
        List<Admin> adminList = adminService.selectByExample(new AdminExample());
        return adminList;
    }

    /**
     * Administrator业务方法
     * 根据主键删除admin数据
     *
     * @param request
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public int deleteByPrimaryKey(HttpServletRequest request) {
        int adminId = Integer.parseInt(request.getParameter("id"));
        adminService.deleteByPrimaryKey(adminId);
        System.out.println("已删除id=" + adminId + "管理员。");
        return 1;
    }

    /**
     * POST
     * Administrator业务方法
     * 增加admin
     */
    //@RequestMapping("/register")
    @PostMapping("/register")
    @ResponseBody
    public int insert(HttpServletRequest request) {
        Admin admin = new Admin();
        admin.setUsername(request.getParameter("username"));
        admin.setPassword(request.getParameter("password"));
        if (admin.getUsername() != null && admin.getPassword() != null) {
            return adminService.insertSelective(admin);
        } else return 0;
    }

    @RequestMapping("/isrepeatname")
    @ResponseBody
    public boolean checkAdminName(HttpServletRequest request) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(request.getParameter("username"));
        List<Admin> list = adminService.selectByExample(adminExample);
        return list.isEmpty();// 有重名的返回true，没有重名的返回false
    }


    //-----------------------------------------------------

    /**
     * 非业务方法
     * 根据主键查询admin用户
     *
     * @param request
     * @return
     */
    @RequestMapping("/showAdmin")
    @ResponseBody
    public Admin toIndex(HttpServletRequest request) {
        int adminId = Integer.parseInt(request.getParameter("id"));
        Admin admin = adminService.getAdminById(adminId);
        return admin;
    }


}
