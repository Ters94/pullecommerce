package com.shop.pullecommerce.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.pullecommerce.model.Category;
import com.shop.pullecommerce.repository.CategoryRepository;


@Controller
public class HomeController {

    private final CategoryRepository categoryRepository;

    public HomeController(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("categoryList", categoryList);
        return "home";
    }
    
}
