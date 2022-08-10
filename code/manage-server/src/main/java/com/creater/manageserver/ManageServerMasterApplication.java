package com.creater.manageserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.creater.manageserver.mapper")
public class ManageServerMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageServerMasterApplication.class, args);
    }

}
