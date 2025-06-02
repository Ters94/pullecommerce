package com.shop.pullecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.pullecommerce.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
}
