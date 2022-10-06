package com.group6.mp2;

import com.group6.mp2.mapper.BookMapper;
import com.group6.mp2.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day08Pm20221005InClassApplicationTests {
    @Autowired
    private IBookService iBookService;

    @Test
    void contextLoads() {
    }

    @Test
    void test20221006(){

        iBookService.buy("tom", 1);

    }

}
