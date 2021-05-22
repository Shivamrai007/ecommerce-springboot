package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.exceptions.CategoryNotFoundException;
import com.ecommerce.exceptions.ProductNotFoundException;
import com.example.config.model.Product;

public interface ProductService {

	public List<ProductDTO> searchProductByProductName(String productName) throws ProductNotFoundException;
	
	public List<ProductDTO> searchProductByCategoryName(String categoryName) throws CategoryNotFoundException, ProductNotFoundException;
}
