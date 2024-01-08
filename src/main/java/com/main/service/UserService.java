package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.User;
import com.main.repo.UserRepository;

@Service
public class UserService {
	@Autowired
 private UserRepository ur;
	
	public User addUser(User user) {
		return ur.save(user);
		
	}
}
