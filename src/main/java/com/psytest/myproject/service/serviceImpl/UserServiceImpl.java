package com.psytest.myproject.service.serviceImpl;

import com.psytest.myproject.bean.User;
import com.psytest.myproject.bean.UserExample;
import com.psytest.myproject.dao.UserMapper;
import com.psytest.myproject.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userdao;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userdao.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return userdao.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userdao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userdao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User record) {
        return userdao.insertSelective(record);
    }
}
