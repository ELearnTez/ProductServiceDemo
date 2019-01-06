package com.elearntez.springbooot.client;

import java.io.IOException;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.elearntez.springbooot.bean.Product;

@Component
public class ProductConsumer {

	public void getProducts() throws Exception {
		String baseUrl  = "http://localhost:8080/products";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Product>> response = restTemplate.exchange(
				baseUrl, HttpMethod.GET, getHeaders(),
				new ParameterizedTypeReference<List<Product>>(){});
		
		response.getBody().forEach(System.out::println);
	}
	
	
	
	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
	
}
