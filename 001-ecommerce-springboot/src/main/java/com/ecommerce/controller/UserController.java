package com.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.LoginRequestDTO;
import com.ecommerce.dto.Message;
import com.ecommerce.exceptions.UserNotFoundException;
import com.ecommerce.service.UserService;
import com.example.config.model.User;


@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<?> login(@RequestBody @Valid LoginRequestDTO loginRequestDTO) throws UserNotFoundException {
		
		User user = userService.login(loginRequestDTO); 
		
		if (user != null) {
			return ResponseEntity.ok(new Message("User is successfully logged in !!!"));
		}else{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Message("Wrong Credentials"));
		}
		
	}
	
}
