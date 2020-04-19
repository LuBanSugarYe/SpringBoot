package com.sugar.mybatis_plus_demo.biz.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sugar.mybatis_plus_demo.biz.admin.entity.Admin;
import com.sugar.mybatis_plus_demo.biz.admin.mapper.AdminMapper;
import com.sugar.mybatis_plus_demo.biz.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * admin业务实现层
 */
@Component
public class AdminServiceImpl  implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> getList(Admin admin) {

        //查询器，第一种方式
        QueryWrapper<Admin> queryWrapper = Wrappers.<Admin>query();
        queryWrapper.like("name",admin.getName()).lt("age",admin.getAge()).select(Admin.class,info -> !info.getColumn().equals("age"));
        //第二种方式
        //QueryWrapper<Admin> query = new QueryWrapper<Admin>();
        List<Admin> adminList = adminMapper.selectList(queryWrapper);

        return adminList;
    }

    @Override
    public IPage<Admin> getAdminList(Integer current,Integer size) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("age", 23);
        Page<Admin> page = new Page<>(current,size);
        IPage<Admin> iPage = adminMapper.selectPage(page, queryWrapper);
        System.out.println("总页数="+iPage.getPages());
        System.out.println("总记录数="+iPage.getTotal());
        List<Admin> users = iPage.getRecords();
        return iPage;
    }

}
