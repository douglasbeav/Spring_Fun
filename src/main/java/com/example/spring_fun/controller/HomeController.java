package com.example.spring_fun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "home/index";
    }

    @PostMapping("/personData")
    public String personData(WebRequest wr, Model model) {
        String firstName = wr.getParameter("fname");
        String lastName = wr.getParameter("lname");

        model.addAttribute("first_name", firstName);
        model.addAttribute("last_name", lastName);

        return "home/personData";
    }

}
