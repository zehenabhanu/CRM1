package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.AdminLogin;
import com.main.repo.AdminLoginRepo;
import com.main.service.AdminLoginService;
@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminLoginController {
	@Autowired
	private AdminLoginService als;
	
	@PostMapping("/addd")
	public AdminLogin postAdminLogin(@RequestBody AdminLogin al) {
		return als.addAdminLogin(al);
	}
	
	@GetMapping("/all")
	public List<AdminLogin> getAdminLogin() {
		return als.fetchAdminLogin();
	}
	
	@Autowired
 private AdminLoginRepo alr;
	
	@PostMapping("/add")
	public ResponseEntity<?> postadminLogin(@RequestBody AdminLogin al){
		System.out.println(al);
		AdminLogin aln=alr.findByAdmin(al.getAdmin());
		if(aln.getPassword().equals(al.getPassword()))
			return ResponseEntity.ok(aln);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
}
