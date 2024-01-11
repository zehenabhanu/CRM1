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

import com.main.entity.EmpLogin;
import com.main.repo.EmpLoginRepo;
import com.main.service.EmpLoginService;
@RestController
@RequestMapping("/emp1")
@CrossOrigin("*")
public class EmpLoginController {
	@Autowired
	private EmpLoginService els;
	
	@PostMapping("/addd")
	public EmpLogin postEmpLogin(@RequestBody EmpLogin el) {
		return els.addEmpLogin(el);
	}
	
	@GetMapping("/all")
	public List<EmpLogin> getEmpLogin() {
		return els.fetchEmpLogin();
	}
	
@Autowired
	private EmpLoginRepo elr;

@PostMapping("/add")
public ResponseEntity<?> postempLogin(@RequestBody EmpLogin el){
	System.out.println(el);
	EmpLogin eln=elr.findByEmpname(el.getEmpname());
	if(eln.getPassword().equals(el.getPassword()))
		return ResponseEntity.ok(eln);
	return (ResponseEntity<?>) ResponseEntity.internalServerError();
	
}
}
