package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.LoginRequestDTO;
import com.ecommerce.exceptions.UserNotFoundException;
import com.ecommerce.service.UserService;
import com.example.config.model.User;
import com.example.config.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User login(LoginRequestDTO loginRequestDTO) throws UserNotFoundException {
		
		User user =userRepository.getUserByUsernameAndPassword(loginRequestDTO.getUsername(), loginRequestDTO.getPassword());
		
		if (user != null) {
			return user;
		}else {
			throw new UserNotFoundException("User Not Found");
			
		}
		
	}

	
}
