package com.sugar.mybatis_plus_demo.biz.admin.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sugar.mybatis_plus_demo.biz.admin.entity.Admin;
import com.sugar.mybatis_plus_demo.biz.admin.service.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "管理员接口",tags = "管理员接口")
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    /**
     *
     * @param admin
     * @return
     */
    @GetMapping("/getAdminList")
    @ResponseBody
    public Map<String,Object> getAdminList(Admin admin){
        List<Admin> list = adminService.getList(admin);
        Map<String,Object> result = new HashMap<>();
        result.put("data",list);
        return result;

    }

    /**
     * 分页查询
     * @param page
     * @return list
     */
    @PostMapping("/getPage")
    @ResponseBody
    public IPage<Admin> getAdminList(Integer current,Integer size){

        return adminService.getAdminList(current,size);
    }

}
