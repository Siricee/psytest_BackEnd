package com.psytest.myproject.service.serviceImpl;

import com.psytest.myproject.bean.Scl90;
import com.psytest.myproject.bean.Scl90Example;
import com.psytest.myproject.dao.Scl90Mapper;
import com.psytest.myproject.service.Scl90Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("scl90Service")
public class Scl90ServiceImpl implements Scl90Service {
    @Resource
    private Scl90Mapper scl90dao;

    @Override
    public int deleteByExample(Scl90Example example) {
        return scl90dao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scl90dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Scl90 record) {
        return scl90dao.insertSelective(record);
    }

    @Override
    public List<Scl90> selectByExample(Scl90Example example) {
        return scl90dao.selectByExample(example);
    }
}
