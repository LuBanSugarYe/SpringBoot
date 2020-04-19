package com.sugar.mybatis_plus_demo.biz.user.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sugar.mybatis_plus_demo.biz.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //保存
    boolean save(User user);

    //查询
    List<User> getlist();

    //更新用户信息
    boolean update(User user);

    //根据Id查询用户数据
    User getUserById(String uid);

    //根据查询条件查询
    User getUserByCondition(User user);
}
