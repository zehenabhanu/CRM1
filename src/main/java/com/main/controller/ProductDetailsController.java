package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.ProductDetails;
import com.main.service.ProductDetailsService;

@RestController
@RequestMapping("/pd")
@CrossOrigin("*")
public class ProductDetailsController {
	@Autowired
  private ProductDetailsService pds;
	
	@PostMapping("/add")
	public ProductDetails postProductDetails(@RequestBody ProductDetails pd) {
		return pds.addProductDetails(pd);
	}
	
	@GetMapping("/all")
	public List<ProductDetails> getProductDetails() {
		return pds.getAllProductDetails();
	}
  
}
