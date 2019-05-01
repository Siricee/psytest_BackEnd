package com.psytest.myproject.service;

import com.psytest.myproject.bean.Dass21;
import com.psytest.myproject.bean.Dass21Example;


import java.util.List;

public interface Dass21Service {
    int deleteByExample(Dass21Example example);
    int insertSelective(Dass21 record);
//    int updateByPrimaryKeySelective(Dass21 record);
    List<Dass21> selectByExample(Dass21Example example);
    int deleteByPrimaryKey(Integer id);
    List<Dass21> getRecordWithUserinfo();


}
