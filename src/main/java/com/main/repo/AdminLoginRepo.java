package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.AdminLogin;
@Repository
public interface AdminLoginRepo extends JpaRepository<AdminLogin, Integer>{
	
	AdminLogin findByAdmin(String admin);


}
