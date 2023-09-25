package com.example.demoapi2.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping("/secure/hello")
    public String resHelloWorld() throws JsonProcessingException {
        return "hellow sec";
    }

}
