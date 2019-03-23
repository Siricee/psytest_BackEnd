package com.psytest.myproject.controller;

import com.psytest.myproject.bean.Admin;
import com.psytest.myproject.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/showAdmin")
    @ResponseBody
    public Admin toIndex(HttpServletRequest request,Model model){
        int adminId = Integer.parseInt(request.getParameter("id"));
        Admin admin = this.adminService.getAdminById(adminId);
        return admin;
    }

}
