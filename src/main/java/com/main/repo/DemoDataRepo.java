package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.DemoData;

public interface DemoDataRepo extends JpaRepository<DemoData, Integer>{

}
