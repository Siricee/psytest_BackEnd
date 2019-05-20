package com.psytest.myproject.controller;


import com.psytest.myproject.bean.User;
import com.psytest.myproject.bean.UserExample;
import com.psytest.myproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserContrller {
    @Resource
    private UserService userService;

    /**
     * POST
     * 业务主要方法
     *
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public User login(HttpServletRequest request) {
        System.out.println("received request!");
        UserExample userExample = new UserExample();
//        System.out.println(request.getParameter("username"));
//        System.out.println(request.getParameter("password"));
        UserExample.Criteria userExampleCriteria = userExample.createCriteria();
        userExampleCriteria.andUsernameEqualTo(request.getParameter("username"));
        userExampleCriteria.andPasswordEqualTo(request.getParameter("password"));
        List<User> result = userService.selectByExample(userExample);
        if (!result.isEmpty()) {
            return result.get(0);
        } else {
            return null;
        }
    }

    /**
     * 返回所有User记录
     *
     * @param request
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<User> selectByExample(HttpServletRequest request) {
        List<User> list = userService.selectByExample(new UserExample());
        return list;
    }

    /**
     * 根据id返回单个用户信息
     *
     * @param request
     * @return
     */
    @RequestMapping("/info")
    @ResponseBody
    public User selectByPrimaryKey(HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        return userService.selectByPrimaryKey(id);
    }

    @PostMapping("/register")
    @ResponseBody
    public int insertSelective(HttpServletRequest request) {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setSex(Integer.parseInt(request.getParameter("sex")));
        user.setWork(request.getParameter("work"));
        user.setLocation(request.getParameter("location"));
        user.setSalary(Integer.parseInt(request.getParameter("salary")));
        user.setMarriage(Integer.parseInt(request.getParameter("marriage")));

        if (user.getUsername() != null && user.getPassword() != null) {
            return userService.insertSelective(user);
        } else return 0;
    }

    @RequestMapping("/isrepeatname")
    @ResponseBody
    public boolean checkAdminName(HttpServletRequest request) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(request.getParameter("username"));
        List<User> list = userService.selectByExample(userExample);
        return list.isEmpty();// 有重名的返回false，没有重名的返回true
    }

    @PostMapping("/update_userinfo")
    @ResponseBody
    public int updateByPrimaryKeySelective(HttpServletRequest request) {
        User user = new User();
        // 根据主键更新，必须有主键字段
        user.setId(Integer.parseInt(request.getParameter("id")));

        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setSex(Integer.parseInt(request.getParameter("age")));
        user.setWork(request.getParameter("work"));
        user.setLocation(request.getParameter("location"));
        user.setSalary(Integer.parseInt(request.getParameter("salary")));
        user.setMarriage(Integer.parseInt(request.getParameter("marriage")));

        if (user.getUsername() != null && user.getPassword() != null) {
            return userService.updateByPrimaryKeySelective(user);
        } else return 0;
    }


}
