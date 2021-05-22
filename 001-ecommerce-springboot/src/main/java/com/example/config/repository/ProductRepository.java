package com.example.config.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.config.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	public List<Product> findProductsByProductNameContains(String productName);
	
	public List<Product> findProductsByCategoryId(String categoryId);
}
