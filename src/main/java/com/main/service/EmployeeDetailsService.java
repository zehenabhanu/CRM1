package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.EmployeeDetails;
import com.main.repo.EmployeeDetailsRepo;
@Service
public class EmployeeDetailsService {
	@Autowired
 private EmployeeDetailsRepo edr;
	
	public EmployeeDetails addEmployeeDetails(EmployeeDetails ed) {
		return edr.save(ed);
	}
	
	public List<EmployeeDetails> fetchEmployeeDetails() {
		return edr.findAll();
	}
	
	public void delEmployeeDetails(int id) {
		edr.deleteById(id);
	}
	
	public Optional<EmployeeDetails> fetchbyid(int id) {
		return edr.findById(id);
	}
	
	public EmployeeDetails updatebyid(int id,EmployeeDetails ed) {
		Optional<EmployeeDetails> employeeDetails=edr.findById(id);
		if(employeeDetails.isPresent()) {
			EmployeeDetails existingEmployeeDetails=employeeDetails.get();
			existingEmployeeDetails.setName(ed.getName());
			existingEmployeeDetails.setEmail(ed.getEmail());
			existingEmployeeDetails.setPhone(ed.getPhone());
			return edr.save(existingEmployeeDetails);
		}
	  else {
		  return null;
	  }
	}
}
