package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.FAQ;
import com.main.service.FAQService;

@RestController
@RequestMapping("/faq")
@CrossOrigin("*")
public class FAQController {
	@Autowired
  private FAQService fs;
	
	@PostMapping("/add")
	public FAQ postFAQ(@RequestBody FAQ faq){
		return fs.addFAQ(faq);
	}
	
	@GetMapping("/all")
	public List<FAQ> getFAQ() {
		return fs.fetchFAQ();
	}
}
