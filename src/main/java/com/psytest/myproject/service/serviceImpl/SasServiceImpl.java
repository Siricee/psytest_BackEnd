package com.psytest.myproject.service.serviceImpl;

import com.psytest.myproject.bean.Sas;
import com.psytest.myproject.bean.SasExample;
import com.psytest.myproject.dao.SasMapper;
import com.psytest.myproject.service.SasService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sasService")
public class SasServiceImpl implements SasService {
    @Resource
    private SasMapper sasdao;

    @Override
    public int deleteByExample(SasExample example) {
        return sasdao.deleteByExample(example);
    }

    @Override
    public List<Sas> selectByExample(SasExample example) {
        return sasdao.selectByExample(example);
    }

    @Override
    public int insertSelective(Sas record) {
        return sasdao.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sasdao.deleteByPrimaryKey(id);
    }
}
