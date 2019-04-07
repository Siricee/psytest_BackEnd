package com.psytest.myproject.service.serviceImpl;


import com.psytest.myproject.bean.Admin;
import com.psytest.myproject.bean.AdminExample;
import com.psytest.myproject.dao.AdminMapper;
import com.psytest.myproject.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper admindao;

    @Override
    public Admin getAdminById(int adminId) {
        return admindao.selectByPrimaryKey(adminId);
    }

    @Override
    public int insertSelective(Admin record) {

        admindao.insertSelective(record);
//        System.out.println("插入成功");
        return 1;
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {

//        example = new AdminExample();
//        AdminExample.Criteria adminCriteria = example.createCriteria();// Criteria是当前AdminExample的静态内部类
//        adminCriteria.andUsernameLike("%o%");//后面能有很多方法可以进行模糊查询、拼接查询等
//        List<Admin> adminList = admindao.selectByExample(example);

        List<Admin> list = admindao.selectByExample(example);
        return list;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        admindao.deleteByPrimaryKey(id);
        return 1;
    }


}
