package com.main.controller;

import org.springframework.web.bind.annotation.RestController;

import com.main.entity.User;
import com.main.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	@Autowired
private UserService us;
@PostMapping("/add")
public User postUser(@RequestBody User user) {
	return us.addUser(user);
	
}
}
