package com.nicy.turing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(value = 1)
@SpringBootApplication
public class TuringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuringApplication.class, args);
    }

}
