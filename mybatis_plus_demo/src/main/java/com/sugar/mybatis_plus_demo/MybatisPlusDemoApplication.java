package com.sugar.mybatis_plus_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(
        basePackages = {
                "com.sugar.mybatis_plus_demo",
                "com.sugar.mybatis_plus_demo.biz",
                "com.sugar.mybatis_plus_demo.biz.**.controller",
                "com.sugar.mybatis_plus_demo.biz.**.service"
           })
@MapperScan("com.sugar.mybatis_plus_demo.biz.**.mapper")
public class MybatisPlusDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDemoApplication.class, args);
    }

}
