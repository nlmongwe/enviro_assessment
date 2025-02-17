package com.enviro.assessment.grad001.ntwanano.mongwe.demo.configuration;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Categories;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.repository.CategoriesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CategoriesConfig {

    @Bean
    CommandLineRunner categoriesCommandLineRunner(CategoriesRepository categoriesRepository){
        return args -> {
            Categories organic = new Categories("Organic", "Biodegradable food and plant wast");
            Categories recyclables = new Categories("Recyclables", "Paper, glass and metals");
            Categories hazardous = new Categories("Hazardous", "Toxic materials, batteries and chemicals");
            Categories generalWaste = new Categories("General Waste", "Non-recyclable, non hazardous trash");

            categoriesRepository.saveAll(List.of(organic,recyclables,hazardous,generalWaste));
        };
    }
}
