package com.psytest.myproject.service;

import com.psytest.myproject.bean.User;
import com.psytest.myproject.bean.UserExample;

import java.util.List;

public interface UserService {
    User selectByPrimaryKey(Integer id);
    List<User> selectByExample(UserExample example);
    int updateByPrimaryKeySelective(User record);
    int deleteByPrimaryKey(Integer id);
    int insertSelective(User record);
}
