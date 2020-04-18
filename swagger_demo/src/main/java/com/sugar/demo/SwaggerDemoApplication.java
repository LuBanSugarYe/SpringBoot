package com.sugar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"org.bitbucket.tek.nik.simplifiedswagger","com.suagr.demo"})
@ComponentScan({"com.sugar","org.bitbucket.tek.nik.simplifiedswagger"})
public class SwaggerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerDemoApplication.class, args);
	}

}
