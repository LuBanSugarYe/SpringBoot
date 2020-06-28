package com.nicy.turing.util;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author SugarYe
 * @date 2020年06月27日 11:06
 */
@Component
public class LogUtil implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Turing Project is run!");

    }
}
