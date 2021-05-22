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
import com.ecommerce.service.ProductService;
import com.example.config.model.Category;
import com.example.config.model.Product;
import com.example.config.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryService categoryService;

	public List<ProductDTO> searchProductByProductName(String productName) throws ProductNotFoundException {
		List<Product> productList = productRepository.findProductsByProductNameContains(productName);

		if (!productList.isEmpty()) {

			List<ProductDTO> productDTOList = new ArrayList<>();

			for (Product product : productList) {
				ProductDTO productDTO = new ProductDTO();
				BeanUtils.copyProperties(product, productDTO);
				productDTOList.add(productDTO);
			}
			
			return productDTOList;
		} else {
			throw new ProductNotFoundException("Product not Fount with product Name " + productName);
		}

	}
	
	public List<ProductDTO> searchProductByCategoryName(String categoryName) throws CategoryNotFoundException, ProductNotFoundException{
		
		Category category = categoryService.findCategoryByCategoryName(categoryName);
		
		List<Product> productList = productRepository.findProductsByCategoryId(String.valueOf(category.getCategoryId()));
		
		if (!productList.isEmpty()) {

			List<ProductDTO> productDTOList = new ArrayList<>();

			for (Product product : productList) {
				ProductDTO productDTO = new ProductDTO();
				BeanUtils.copyProperties(product, productDTO);
				productDTOList.add(productDTO);
			}
			
			return productDTOList;
		} else {
			throw new ProductNotFoundException("Product not Fount with Category Name " + categoryName);
		}
		
		
	}
}
