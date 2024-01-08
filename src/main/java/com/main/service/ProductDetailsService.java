package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.ProductDetails;
import com.main.repo.ProductDetailsRepo;

@Service
public class ProductDetailsService {
	@Autowired
  private ProductDetailsRepo pdr;
	
	public ProductDetails addProductDetails(ProductDetails pd) {
		return pdr.save(pd);
	}
	
	public List<ProductDetails> getAllProductDetails() {
		return pdr.findAll();
	}
}
