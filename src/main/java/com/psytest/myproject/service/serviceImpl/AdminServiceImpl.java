package com.psytest.myproject.service.serviceImpl;


import com.psytest.myproject.bean.Admin;
import com.psytest.myproject.dao.AdminMapper;
import com.psytest.myproject.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
    @Resource
    private AdminMapper admindao;
    @Override
    public Admin getAdminById(int adminId) {
        return admindao.selectByPrimaryKey(adminId);
    }
}
