package com.psytest.myproject.dao;

import com.psytest.myproject.bean.Sas;
import com.psytest.myproject.bean.SasExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface SasMapper {
    int countByExample(SasExample example);

    int deleteByExample(SasExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sas record);

    int insertSelective(Sas record);

    List<Sas> selectByExample(SasExample example);

    Sas selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sas record, @Param("example") SasExample example);

    int updateByExample(@Param("record") Sas record, @Param("example") SasExample example);

    int updateByPrimaryKeySelective(Sas record);

    int updateByPrimaryKey(Sas record);

    @Select("SELECT * FROM sas")
    @Results({@Result(property = "user",column = "userid",one = @One(select="com.psytest.myproject.dao.UserMapper.selectByPrimaryKey"))})
    List<Sas> getRecordWithUserinfo();
}