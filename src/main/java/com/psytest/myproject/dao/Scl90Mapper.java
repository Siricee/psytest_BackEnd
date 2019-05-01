package com.psytest.myproject.dao;

import com.psytest.myproject.bean.Scl90;
import com.psytest.myproject.bean.Scl90Example;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface Scl90Mapper {
    int countByExample(Scl90Example example);

    int deleteByExample(Scl90Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scl90 record);

    int insertSelective(Scl90 record);

    List<Scl90> selectByExample(Scl90Example example);

    Scl90 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scl90 record, @Param("example") Scl90Example example);

    int updateByExample(@Param("record") Scl90 record, @Param("example") Scl90Example example);

    int updateByPrimaryKeySelective(Scl90 record);

    int updateByPrimaryKey(Scl90 record);

    @Select("SELECT * FROM scl90")
    @Results({@Result(property = "user",column = "userid",one = @One(select="com.psytest.myproject.dao.UserMapper.selectByPrimaryKey"))})
    List<Scl90> getRecordWithUserinfo();
}