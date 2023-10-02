package com.example.demoapi2.controllers;

import com.example.demoapi2.models.Order;
import com.example.demoapi2.models.Product;
import com.example.demoapi2.repository.ProductRepository;
import com.example.demoapi2.service.OrderService;
import com.example.demoapi2.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@RestController
@RequestMapping("hello/")
public class MyFirstController {

    private ProductService productService;
    private OrderService orderService;
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public MyFirstController(ProductService productService, OrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public String resHelloWorld() throws JsonProcessingException {
        try{
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder stringBuilder = new StringBuilder();
            Random random = new Random();
            for(int i = 0; i< 10;i++){
                int randomIndex = random.nextInt(characters.length());
                char randomChar = characters.charAt(randomIndex);
                stringBuilder.append(randomChar);
            }

            Product product = new Product(stringBuilder.toString(), Calendar.getInstance().getTime());
            return objectMapper.writeValueAsString(productService.addProduct(product));
        }catch (Exception e){
            return objectMapper.writeValueAsString(e);
        }
    }

    @GetMapping("/test")
    public String testhello() throws JsonProcessingException {

        return "behnam";
    }

    @GetMapping("/addorder")
    public String addorder() throws JsonProcessingException {

        Order order = new Order();
        orderService.addOrder(order);
        return "behnam";
    }
}
