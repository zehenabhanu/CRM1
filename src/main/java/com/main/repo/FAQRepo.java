package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.FAQ;

public interface FAQRepo extends JpaRepository<FAQ, Integer> {

}
