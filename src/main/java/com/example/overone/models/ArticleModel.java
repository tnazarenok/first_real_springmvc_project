package com.example.overone.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "articles")
public class ArticleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "title")
    String title;

    @Column(name = "disc")
    String disc;

    @Column(name = "full_text")
    String fullText;
}
