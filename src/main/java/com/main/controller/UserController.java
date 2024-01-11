package com.main.controller;

import org.springframework.web.bind.annotation.RestController;

import com.main.entity.User;
import com.main.repo.UserRepository;
import com.main.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

@GetMapping("/all")
public List<User> getUser() {
	return us.fetchUser();
	
}

@Autowired
private UserRepository ury;

@PostMapping("/addd")
public ResponseEntity<?> postuserLogin(@RequestBody User u){
	System.out.println(u);
	User uln=ury.findByUsername(u.getUsername());
	if(uln.getPassword().equals(u.getPassword()))
		return ResponseEntity.ok(uln);
	return (ResponseEntity<?>) ResponseEntity.internalServerError();
	
}
}
