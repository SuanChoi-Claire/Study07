package com.learn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.entity.User;
import com.learn.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository){
		this.userRepository = userRepository;
	}//초기화 의존성 UserService에서 받은거. 

	public List<User> getAllUsers(){
		List<User> result = null;
		result = userRepository.findAll();
		return result;
	}
	
	
	public User createUser(String name){
		User result = null;
		result = userRepository.save(new User(name));
		return result;
	}
	
}
