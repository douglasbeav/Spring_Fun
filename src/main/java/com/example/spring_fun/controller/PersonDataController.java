package com.example.spring_fun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonDataController {

    @GetMapping("/personData")
    public String personData() {
        return "home/personData";
    }

    @PostMapping("/index")
    public String returnToIndex() {
        return "home/index";
    }
}
