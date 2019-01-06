package com.elearntez.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearntez.springboot.bean.Product;

@RestController
public class ProductController {
	
	private ProductUtil productUtil;

	@Autowired
	public void setProductUtil(ProductUtil productUtil) {
		this.productUtil = productUtil;
	}
	
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productUtil.getProducts();
	}
}
