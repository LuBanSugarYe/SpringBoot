package com.sugar.mybatis_plus_demo.biz.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sugar.mybatis_plus_demo.biz.admin.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    //查询列表
    List<Admin> getList(Admin admin);

    //分页查询
    IPage<Admin>  getAdminList(Integer current,Integer size);
}
