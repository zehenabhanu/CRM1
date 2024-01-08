package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.EmployeeDetails;

public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails, Integer> {

}
