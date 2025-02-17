package com.enviro.assessment.grad001.ntwanano.mongwe.demo.model;

import jakarta.persistence.*;

@Entity
@Table
@SequenceGenerator(name = "waste_seq", sequenceName = "waste_sequence", initialValue = 1, allocationSize = 1)
public class Waste {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "waste_seq")
    private Integer id;
    private String name;
    private String category;
    private String disposalMethod;
    private String recyclingTips;

    public Waste(String name, String category, String disposalMethod, String recyclingTips, int id) {
        this.name = name;
        this.category = category;
        this.disposalMethod = disposalMethod;
        this.recyclingTips = recyclingTips;
        this.id = id;
    }

    public Waste(String name, String category, String disposalMethod, String recyclingTips) {
        this.name = name;
        this.category = category;
        this.disposalMethod = disposalMethod;
        this.recyclingTips = recyclingTips;
    }

    public Waste() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDisposalMethod(String disposalMethod) {
        this.disposalMethod = disposalMethod;
    }

    public void setRecyclingTips(String recyclingTips) {
        this.recyclingTips = recyclingTips;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDisposalMethod() {
        return disposalMethod;
    }

    public String getRecyclingTips() {
        return recyclingTips;
    }

    @Override
    public String toString() {
        return "Waste{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryId=" + category +
                ", disposalMethod='" + disposalMethod + '\'' +
                ", recyclingTips='" + recyclingTips + '\'' +
                '}';
    }
}
