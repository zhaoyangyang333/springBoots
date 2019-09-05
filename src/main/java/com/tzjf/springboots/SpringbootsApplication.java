package com.tzjf.springboots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.tzjf.springboots.listener")
public class SpringbootsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsApplication.class, args);
    }

}
