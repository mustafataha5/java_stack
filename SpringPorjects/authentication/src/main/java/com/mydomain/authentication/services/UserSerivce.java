package com.mydomain.authentication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.authentication.models.User;
import com.mydomain.authentication.repositories.UserRepository;

@Service
public class UserSerivce {
	@Autowired
	UserRepository userRepository ; 
	
	public User createUesr(User u) {
		return userRepository.save(u);
	} 
	
	public User findUser(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		if(userOptional.isPresent()) {
			return userOptional.get();
		}
		return null ; 
	}
	
	
}
