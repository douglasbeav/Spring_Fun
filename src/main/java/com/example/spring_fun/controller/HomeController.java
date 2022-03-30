package com.example.spring_fun.controller;

import com.example.spring_fun.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @PostMapping("/personData")
    public String personData(/*WebRequest wr*/ @ModelAttribute Person person, Model model) {
        /*String firstName = wr.getParameter("fname");
        String lastName = wr.getParameter("lname");*/

        /*model.addAttribute("first_name", firstName);
        model.addAttribute("last_name", lastName);*/

        model.addAttribute("Person", person);

        return "home/personData";
    }

}
