package com.psytest.myproject.service;

import com.psytest.myproject.bean.Sas;
import com.psytest.myproject.bean.SasExample;

import java.util.List;

public interface SasService {
    int deleteByExample(SasExample example);
    List<Sas> selectByExample(SasExample example);
    int insertSelective(Sas record);
    int deleteByPrimaryKey(Integer id);
}
