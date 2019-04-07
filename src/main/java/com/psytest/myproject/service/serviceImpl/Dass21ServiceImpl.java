package com.psytest.myproject.service.serviceImpl;

import com.psytest.myproject.bean.Dass21;
import com.psytest.myproject.bean.Dass21Example;
import com.psytest.myproject.dao.Dass21Mapper;
import com.psytest.myproject.service.Dass21Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("dass21Service")
public class Dass21ServiceImpl implements Dass21Service {
    @Resource
    private Dass21Mapper Dass21dao;

    @Override
    public int deleteByExample(Dass21Example example) {
        return Dass21dao.deleteByExample(example);
    }

    @Override
    public int insertSelective(Dass21 record) {
        return Dass21dao.insertSelective(record);
    }

    @Override
    public List<Dass21> selectByExample(Dass21Example example) {
        return Dass21dao.selectByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return Dass21dao.deleteByPrimaryKey(id);
    }
}
