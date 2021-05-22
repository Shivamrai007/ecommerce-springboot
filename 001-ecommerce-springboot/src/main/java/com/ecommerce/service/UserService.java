package com.ecommerce.service;

import com.ecommerce.dto.LoginRequestDTO;
import com.ecommerce.dto.Message;
import com.ecommerce.exceptions.UserNotFoundException;
import com.example.config.model.User;

public interface UserService {

	public User login(LoginRequestDTO loginRequestDTO) throws UserNotFoundException;
}
