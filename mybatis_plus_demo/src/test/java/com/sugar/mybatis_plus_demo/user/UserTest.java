package com.sugar.mybatis_plus_demo.user;

import com.sugar.mybatis_plus_demo.biz.user.entity.User;
import com.sugar.mybatis_plus_demo.biz.user.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void userSelect(){
        System.out.println("---------selectAll method test---------------");
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(15,userList.size());
        userList.forEach(System.out::println);
    }
}
