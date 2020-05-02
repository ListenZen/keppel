package com.keppel.engineer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.keppel.engineer.dao.mapper")
public class EngineerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineerApplication.class, args);
    }

}
