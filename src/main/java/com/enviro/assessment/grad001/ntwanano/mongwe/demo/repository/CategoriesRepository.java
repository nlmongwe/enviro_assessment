package com.enviro.assessment.grad001.ntwanano.mongwe.demo.repository;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
