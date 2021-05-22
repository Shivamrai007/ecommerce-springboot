package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.exceptions.ProductNotFoundException;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<ProductDTO> searchProductByProductName(String productName) throws ProductNotFoundException{
		return productService.searchProductByProductName(productName);
	}
}
