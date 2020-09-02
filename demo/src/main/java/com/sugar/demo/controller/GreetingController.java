package com.sugar.demo.controller;

import com.sugar.demo.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author SugarYe
 * @date 2020年06月30日 21:23
 */

@RestController
public class GreetingController {
    //定义输出文字模板
    private static final String template = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * greeting方法
     * @param name
     * @return
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name){
        //返回值
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

}
