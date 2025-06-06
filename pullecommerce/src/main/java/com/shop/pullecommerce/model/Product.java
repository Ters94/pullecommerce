package com.shop.pullecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Product {
    @Id @GeneratedValue
   
    private Long id;
    private String name;
    private String description;
    private double price;
    
@ManyToOne
private Category category;
}
