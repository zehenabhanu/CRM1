package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.DemoData;
import com.main.service.DemoDataService;

@RestController
@RequestMapping("/dd")
@CrossOrigin("*")
public class DemoDataController {
  @Autowired
  private DemoDataService dds;
  
  @PostMapping("/add")
  public DemoData postDemoData(@RequestBody DemoData dd) {
	return dds.addDemoData(dd);
	  
  }
}
