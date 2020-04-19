package com.sugar.mybatis_plus_demo.biz.user.controller;

import com.sugar.mybatis_plus_demo.biz.user.entity.User;
import com.sugar.mybatis_plus_demo.biz.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * User控制器
 */
@Api(value = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 保存用户数据
     * @param user
     * @return
     */
    @PostMapping("/save")
    @ResponseBody
    public Map<String,Object> save(User user){
        //定义容器，保存数据
        Map<String,Object> result = new HashMap<>();
        result.put("data",user);
        //调用保存方法
        boolean insert = userService.save(user);
        result.put("insert",insert);
        //返回结果
        return result;
    }


    /**
     * 查询用户列表
     * @return
     */
    @GetMapping("/")
    @ResponseBody
    public Map<String,Object> getList(){
        //定义容器，保存数据
        Map<String,Object> result = new HashMap<>();
        //调用查询方法
        result.put("data",userService.getlist());
        //返回结果
        return result;
    }

    /**
     * 更新user数据
     * @param user
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public Map<String,Object> update(User user){
        //定义容器，保存数据
        Map<String,Object> result = new HashMap<>();
        //调用查询方法
        result.put("data",userService.update(user));
        //返回结果
        return result;
    }

    /**
     * 根据id查询
     * @param uid
     * @return
     */
    @GetMapping("/get{uid}")
    @ResponseBody
    public User getUserById(String uid){
        return userService.getUserById(uid);
    }

    /**
     * 根据查询条件查询数据
     * @param user
     * @return
     */
    @GetMapping("/getOne")
    @ResponseBody
    public User getUserByEntity(User user){
        return userService.getUserByCondition(user);
    }
}
