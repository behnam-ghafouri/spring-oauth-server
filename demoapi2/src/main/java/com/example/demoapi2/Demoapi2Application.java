package com.example.demoapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Demoapi2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoapi2Application.class, args);
    }



}
