package com.example.overone.controllers;

import com.example.overone.repos.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/delete")
public class DeleteController {
    final
    ArticleRepo articleRepo;

    public DeleteController(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }
    @GetMapping("/{id}")
    public RedirectView deleteArticle(
            @PathVariable(value = "id") long id){
        articleRepo.deleteById(id);
        return new RedirectView("/allArticles");
    }
}
