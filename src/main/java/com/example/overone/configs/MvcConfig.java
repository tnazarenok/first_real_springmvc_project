package com.example.overone.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewController(ViewControllerRegistry
                                  viewControllerRegistry){
        viewControllerRegistry.addViewController("/login")
                .setViewName("login");
    }
}
