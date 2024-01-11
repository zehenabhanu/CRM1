package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);

}
