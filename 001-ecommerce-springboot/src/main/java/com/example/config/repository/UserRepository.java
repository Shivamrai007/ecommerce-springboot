package com.example.config.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.config.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User getUserByUsernameAndPassword(String username,String password);

}
