package com.nicy.turing.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author SugarYe
 * @date 2020年06月27日 11:36
 */
@Component
public class UserLoginUtil implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("这是一个CommandLineRunner接口");
        //迭代参数
        for (String arg : args){
            System.out.println(arg +"");
        }
    }
}
