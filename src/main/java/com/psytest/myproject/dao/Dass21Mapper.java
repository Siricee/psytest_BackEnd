package com.psytest.myproject.dao;

import com.psytest.myproject.bean.Dass21;
import com.psytest.myproject.bean.Dass21Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Dass21Mapper {
    int countByExample(Dass21Example example);

    int deleteByExample(Dass21Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dass21 record);

    int insertSelective(Dass21 record);

    List<Dass21> selectByExample(Dass21Example example);

    Dass21 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dass21 record, @Param("example") Dass21Example example);

    int updateByExample(@Param("record") Dass21 record, @Param("example") Dass21Example example);

    int updateByPrimaryKeySelective(Dass21 record);

    int updateByPrimaryKey(Dass21 record);
}