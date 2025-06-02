package com.shop.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id @GeneratedValue
    private Long id;
    private String name;

@OneToMany(mappedBy = "category")
private List<Product>products;
}
