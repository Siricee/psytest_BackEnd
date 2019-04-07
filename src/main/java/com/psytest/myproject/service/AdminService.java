package com.psytest.myproject.service;


import com.psytest.myproject.bean.Admin;
import com.psytest.myproject.bean.AdminExample;
import java.util.List;

public interface AdminService {
    public Admin getAdminById(int adminId);
    int insertSelective(Admin record);
    List<Admin> selectByExample(AdminExample example);
    int deleteByPrimaryKey(Integer id);
}
