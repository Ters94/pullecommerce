package com.shop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.shop.model.Category;
import com.shop.repository.CategoryRepository;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private final CategoryRepository categoryRepository;

    public HomeController(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("categorieList", categoryList);
        return "home";
    }
    
}
