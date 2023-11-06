package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DataController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Index Map");
        return "Hello World!";
    }

    @GetMapping("/")
    public String get() {
        System.out.println("Get Map");
        return "Hello World!";

    }
}
