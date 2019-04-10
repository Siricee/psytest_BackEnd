package com.psytest.myproject.service;

import com.psytest.myproject.bean.Novack;
import com.psytest.myproject.bean.NovackExample;

import java.util.List;

public interface NovackService {
    int deleteByExample(NovackExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Novack record);

    List<Novack> selectByExample(NovackExample example);
}
