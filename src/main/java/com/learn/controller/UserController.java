package com.learn.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.User;
import com.learn.service.UserService;



@RequestMapping("/users")
@RestController
public class UserController {
	
	private final UserService userService;
	
	UserController(UserService userService){
		this.userService = userService;
	}
	
	
	@GetMapping
	public List<User> getAllUsers(){
		List<User> result = null;
		result = userService.getAllUsers(); //"getAllUsers()호출";
		return result;
	}
	
	@PostMapping
	public User createUser(String name){
		User result = null;
		result = userService.createUser(name); //"createUser()호출 변수 :" +name;fff
		return result;
	}
	

}
