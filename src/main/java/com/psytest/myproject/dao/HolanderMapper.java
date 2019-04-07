package com.psytest.myproject.dao;

import com.psytest.myproject.bean.Holander;
import com.psytest.myproject.bean.HolanderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolanderMapper {
    int countByExample(HolanderExample example);

    int deleteByExample(HolanderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Holander record);

    int insertSelective(Holander record);

    List<Holander> selectByExample(HolanderExample example);

    Holander selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Holander record, @Param("example") HolanderExample example);

    int updateByExample(@Param("record") Holander record, @Param("example") HolanderExample example);

    int updateByPrimaryKeySelective(Holander record);

    int updateByPrimaryKey(Holander record);
}