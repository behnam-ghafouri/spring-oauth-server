package com.example.demoapi2.controllers;

import com.example.demoapi2.models.Product;
import com.example.demoapi2.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Calendar;

@RestController
@RequestMapping("hello/")
public class MyFirstController {

    @Autowired
    ProductService productService;

    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/add")
    public String resHelloWorld() throws JsonProcessingException {
        Product product = new Product("product1","", Calendar.getInstance().getTime());
        productService.addProduct(product);
        return objectMapper.writeValueAsString(productService.addProduct(product));
    }

    @GetMapping("/test")
    public String testhello() throws JsonProcessingException {

        return "behnam";
    }

}
