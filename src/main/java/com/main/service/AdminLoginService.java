package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.AdminLogin;
import com.main.repo.AdminLoginRepo;

@Service
public class AdminLoginService {
	@Autowired
	private AdminLoginRepo alr;
	
	public AdminLogin addAdminLogin(AdminLogin al) {
		return alr.save(al);
	}

	public List<AdminLogin> fetchAdminLogin() {
		// TODO Auto-generated method stub
		return alr.findAll();
	}

}
