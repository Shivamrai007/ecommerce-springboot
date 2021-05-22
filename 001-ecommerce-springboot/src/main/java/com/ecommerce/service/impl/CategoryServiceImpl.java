package com.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.exceptions.CategoryNotFoundException;
import com.ecommerce.exceptions.ProductNotFoundException;
import com.ecommerce.service.CategoryService;
import com.example.config.model.Category;
import com.example.config.model.Product;
import com.example.config.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public Category findCategoryByCategoryName(String categoryName) throws CategoryNotFoundException {
		Category category = categoryRepository.findCategoryByCategoryName(categoryName);

		if (category != null) {
			return category;
		} else {
			throw new CategoryNotFoundException("Product not Fount with category Name " + categoryName);
		}

	}


}
