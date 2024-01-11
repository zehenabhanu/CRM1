package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.EmpLogin;
import com.main.repo.EmpLoginRepo;
@Service
public class EmpLoginService {
@Autowired
	private EmpLoginRepo elr;

  public EmpLogin addEmpLogin(EmpLogin el)
{
	  return elr.save(el);
}
  
  public List<EmpLogin> fetchEmpLogin() {
	  return elr.findAll();
  }
}
