package com.example.config.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.config.model.Category;
import com.example.config.model.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Product, Long>{

	public Category findCategoryByCategoryName(String categoryName);
}
