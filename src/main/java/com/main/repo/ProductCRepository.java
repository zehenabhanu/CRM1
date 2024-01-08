package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.ProductCategory;

public interface ProductCRepository extends JpaRepository<ProductCategory, Integer>{

}
