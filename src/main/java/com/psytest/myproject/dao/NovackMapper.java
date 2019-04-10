package com.psytest.myproject.dao;

import com.psytest.myproject.bean.Novack;
import com.psytest.myproject.bean.NovackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovackMapper {
    int countByExample(NovackExample example);

    int deleteByExample(NovackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Novack record);

    int insertSelective(Novack record);

    List<Novack> selectByExample(NovackExample example);

    Novack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Novack record, @Param("example") NovackExample example);

    int updateByExample(@Param("record") Novack record, @Param("example") NovackExample example);

    int updateByPrimaryKeySelective(Novack record);

    int updateByPrimaryKey(Novack record);
}