package com.enviro.assessment.grad001.ntwanano.mongwe.demo.service;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Categories;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    private final CategoriesRepository categoriesRepository;

    @Autowired
    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public List<Categories> getCategoriesRepository() {
        return categoriesRepository.findAll();
    }
}
