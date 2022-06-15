package com.example.overone.controllers;

import com.example.overone.models.ArticleModel;
import com.example.overone.repos.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/allArticles")
public class AllArticlesController {

    final
    ArticleRepo articleRepo;

    public AllArticlesController(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @GetMapping
    public String getAllArticles(Model model){
        List<ArticleModel> list;
        list = (List<ArticleModel>) articleRepo.findAll();
        model.addAttribute("allArticles", list);
        return "allArticles";
    }
}
