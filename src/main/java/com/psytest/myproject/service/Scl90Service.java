package com.psytest.myproject.service;

import com.psytest.myproject.bean.Scl90;
import com.psytest.myproject.bean.Scl90Example;

import java.util.List;

public interface Scl90Service {
    int deleteByExample(Scl90Example example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Scl90 record);

    List<Scl90> selectByExample(Scl90Example example);
}
