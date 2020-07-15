package com.nicy.turing.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SugarYe
 * @date 2020年06月28日 10:00
 * @desc 这是一个测试的控制器
 */

@RestController
public class HelloController {

    //项目名称
    //@Value("${project.name}")
    //String name;

    //项目版本号
    //@Value("${project.version}")
    //String version;

    @Autowired
    ProjectEntity projectEntity;

    /**
     * @desc SayHello
     * @return String "Hello SugarYe";
     */
    @GetMapping("/sayHello")
    public String SayHello(){
        return "Hello SuagrYe!  项目名称："+projectEntity.getName()+"版本号："+projectEntity.getVersion();
    }
}
