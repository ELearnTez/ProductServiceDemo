package com.elearntez.springbooot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.elearntez.springbooot.client.ProductConsumer;

@SpringBootApplication
public class ProductClientApplication {

	
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(ProductClientApplication.class, args);
		
		ProductConsumer productConsumer=ctx.getBean(ProductConsumer.class);
		productConsumer.getProducts();
		
		
	}

	

}

