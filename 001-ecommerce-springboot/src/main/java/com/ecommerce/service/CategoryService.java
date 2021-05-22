package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.exceptions.CategoryNotFoundException;
import com.ecommerce.exceptions.ProductNotFoundException;
import com.example.config.model.Category;
import com.example.config.model.Product;

public interface CategoryService {

	public Category findCategoryByCategoryName(String categoryName) throws CategoryNotFoundException;
}
