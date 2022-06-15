package com.example.overone.controllers;

import com.example.overone.models.ArticleModel;
import com.example.overone.repos.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/addarticle")
public class AddArticleConroller {
    final
    ArticleRepo articleRepo;

    public AddArticleConroller(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }


    @GetMapping
    public String addItem(){
        return "addArticle";
    }
    @PostMapping
    public RedirectView saveArticle(@RequestParam String title,
                                    @RequestParam String disc,
                                    @RequestParam String fullText){
        ArticleModel articleModel = new ArticleModel();
        articleModel.setTitle(title);
        articleModel.setDisc(disc);
        articleModel.setFullText(fullText);
        articleRepo.save(articleModel);
        return new RedirectView("/");
    }
}
