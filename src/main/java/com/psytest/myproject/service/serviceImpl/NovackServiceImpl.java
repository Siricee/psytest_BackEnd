package com.psytest.myproject.service.serviceImpl;

import com.psytest.myproject.bean.Novack;
import com.psytest.myproject.bean.NovackExample;
import com.psytest.myproject.dao.NovackMapper;
import com.psytest.myproject.service.NovackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("novack")
public class NovackServiceImpl implements NovackService {
    @Resource
    private NovackMapper novackdao;

    @Override
    public int deleteByExample(NovackExample example) {
        return novackdao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return novackdao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Novack record) {
        return novackdao.insertSelective(record);
    }

    @Override
    public List<Novack> selectByExample(NovackExample example) {
        return novackdao.selectByExample(example);
    }

    @Override
    public List<Novack> getRecordWithUserinfo() {
        return novackdao.getRecordWithUserinfo();
    }
}
