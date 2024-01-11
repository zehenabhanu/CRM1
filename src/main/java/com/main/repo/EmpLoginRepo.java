package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.EmpLogin;
@Repository
public interface EmpLoginRepo extends JpaRepository<EmpLogin, Integer>{
	
	EmpLogin findByEmpname(String empname);
}
