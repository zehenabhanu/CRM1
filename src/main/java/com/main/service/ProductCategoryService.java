package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.ProductCategory;
import com.main.repo.ProductCRepository;
@Service
public class ProductCategoryService {
	@Autowired
 private ProductCRepository pcr;
	public ProductCategory addProductCategory(ProductCategory pc) {
		return pcr.save(pc);
	}
	
	public List<ProductCategory> getAllCategory() {
		return pcr.findAll();		
	}
	
}
