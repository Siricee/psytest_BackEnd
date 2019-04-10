package com.psytest.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 *  默认自动跳转index页面
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(HttpServletResponse response) {
        return "/index.html";
    }
}
