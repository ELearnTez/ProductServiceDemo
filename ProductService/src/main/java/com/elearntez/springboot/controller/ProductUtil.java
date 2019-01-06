package com.elearntez.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.elearntez.springboot.bean.Product;

@Component
public class ProductUtil {
	
	
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<>();
		
		products.add(Product.builder().id(1).name("TV").description("VU Tv").build());
		products.add(Product.builder().id(1).name("Washing Machine").description("Samsung Washing Machine").build());
		products.add(Product.builder().id(1).name("Refrigerator").description("LG refrigerator").build());
		
		
		return products;
	}

}
