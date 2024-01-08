package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.ProductDetails;

public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Integer>{

}
