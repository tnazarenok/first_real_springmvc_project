package com.example.overone.controllers;

import com.example.overone.models.TestModel;
import com.example.overone.repos.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {
    final TestRepo testRepo;

    public MainController(TestRepo testRepo) {
        this.testRepo = testRepo;
    }

    @GetMapping
    public String mainPage(){
        return "index";
    }
}
