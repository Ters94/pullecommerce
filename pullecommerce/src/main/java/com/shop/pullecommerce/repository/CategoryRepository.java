package com.shop.pullecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.pullecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
