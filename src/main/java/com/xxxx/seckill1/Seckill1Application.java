package com.xxxx.seckill1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxxx.seckill1.mapper")//此处是什么原理
public class Seckill1Application {

    public static void main(String[] args) {
        SpringApplication.run(Seckill1Application.class, args);
    }

}
