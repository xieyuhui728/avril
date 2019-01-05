package com.sugar.avril;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class AvrilApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvrilApplication.class, args);
    }

}

