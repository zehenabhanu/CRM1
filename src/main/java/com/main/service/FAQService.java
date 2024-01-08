package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.FAQ;
import com.main.repo.FAQRepo;

@Service
public class FAQService {
	@Autowired
	private FAQRepo fr;
	
	public FAQ addFAQ(FAQ faq) {
		return fr.save(faq);
	}
	
	public List<FAQ> fetchFAQ() {
		return fr.findAll();
	}
	
}
