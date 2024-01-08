package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.ProductCategory;
import com.main.service.ProductCategoryService;

@RestController
@RequestMapping("/pc")
@CrossOrigin("*")
public class ProductCategoryController {
	@Autowired
  private ProductCategoryService pcs;
 @PostMapping("/add")
 public ProductCategory postProductCategory(@RequestBody ProductCategory pc) {
	return pcs.addProductCategory(pc);	 
 }
 
 @GetMapping("/all")
 public List<ProductCategory> getAllPC() {
	return pcs.getAllCategory();	 
 }
 
}
