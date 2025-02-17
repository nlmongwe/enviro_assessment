package com.enviro.assessment.grad001.ntwanano.mongwe.demo.model;

import jakarta.persistence.*;

@Entity
@Table
@SequenceGenerator(name = "category_seq", sequenceName = "category_sequence", initialValue = 1, allocationSize = 1)
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
    private int categoryId;
    private String name;
    private String description;

    public Categories(int categoryId, String name, String description) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }

    public Categories(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Categories() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
