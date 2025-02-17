package com.enviro.assessment.grad001.ntwanano.mongwe.demo.controller;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Categories;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;

    @Autowired
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping
    public List<Categories> getCategories(){
        return categoriesService.getCategoriesRepository();
    }
}
