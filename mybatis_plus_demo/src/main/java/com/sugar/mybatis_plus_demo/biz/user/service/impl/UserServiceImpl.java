package com.sugar.mybatis_plus_demo.biz.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sugar.mybatis_plus_demo.biz.user.entity.User;
import com.sugar.mybatis_plus_demo.biz.user.mapper.UserMapper;
import com.sugar.mybatis_plus_demo.biz.user.service.UserService;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User接口实现层
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public boolean save(User user) {
        int result = userMapper.insert(user);
        boolean insert = result <= 0 ? false : true;
        return insert;
    }

    @Override
    public List<User> getlist() {
        return userMapper.selectList(null);
    }

    @Override
    public boolean update(User user) {
        int result = userMapper.updateById(user);
        boolean update = result <=0 ? false : true;
        return update;
    }

    @Override
    public User getUserById(String uid) {
        return userMapper.selectById(uid);
    }

    @Override
    public User getUserByCondition(User user) {
        User result = userMapper.selectOne(new QueryWrapper<>(user));
        return result;
    }



}
