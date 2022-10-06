package com.group6.mp2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.group6.mp2.mapper")
public class Day08Pm20221005InClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day08Pm20221005InClassApplication.class, args);
    }

}
