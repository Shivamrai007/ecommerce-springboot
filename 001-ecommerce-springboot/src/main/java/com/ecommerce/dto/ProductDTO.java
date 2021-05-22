package com.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

	private Long productId;
	private String productName;
	private String price;
	private String quantity;
	private String description;
	private String categoryId;
}
