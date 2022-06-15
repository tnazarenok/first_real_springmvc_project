package com.example.overone.controllers;

import com.example.overone.models.ArticleModel;
import com.example.overone.repos.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping("/article")
public class ArticleController {

    final
    ArticleRepo articleRepo;

    public ArticleController(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @GetMapping("/{id}")
    public String getDetailArticle(@PathVariable(value = "id")
                                   long id, Model model){
        Optional<ArticleModel> articleModel = articleRepo.findById(id);
        ArrayList<ArticleModel> list = new ArrayList<>();
        articleModel.ifPresent(list::add);
        model.addAttribute("articles", list);
        return "Article";
    }


}
