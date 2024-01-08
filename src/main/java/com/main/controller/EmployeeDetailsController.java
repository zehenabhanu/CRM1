package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.EmployeeDetails;
import com.main.service.EmployeeDetailsService;

@RestController
@RequestMapping("/emp")
@CrossOrigin("*")
public class EmployeeDetailsController {
	@Autowired
	private EmployeeDetailsService eds;
	
	@PostMapping("/add")
	public EmployeeDetails postEmployeeDetails(@RequestBody EmployeeDetails ed) {
		return eds.addEmployeeDetails(ed);
	}
	
	@GetMapping("/all")
	public List<EmployeeDetails> getEmployeeDetails() {
		return eds.fetchEmployeeDetails();
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteEmployeeDetails(@PathVariable int id) {
		eds.delEmployeeDetails(id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<EmployeeDetails> getbyidEmployeeDetails(@PathVariable int id) {
		return eds.fetchbyid(id);
	}
	
	@PutMapping("/put/{id}")
	public EmployeeDetails putEmployeeDetails(@PathVariable int id,@RequestBody EmployeeDetails ed) {
		return eds.updatebyid(id, ed);
	}
}
