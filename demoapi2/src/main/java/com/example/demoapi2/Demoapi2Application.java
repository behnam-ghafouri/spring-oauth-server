package com.example.demoapi2;

import com.example.demoapi2.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableAsync
public class Demoapi2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoapi2Application.class, args);
    }
}
