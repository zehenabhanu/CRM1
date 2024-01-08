package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.DemoData;
import com.main.repo.DemoDataRepo;
@Service
public class DemoDataService {
	@Autowired
  private DemoDataRepo ddr;
	
	public DemoData addDemoData(DemoData dd) {
		return ddr.save(dd);
	}
  
}
