package com.gosaint.springcloudprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gosaint.springcloudprovider.domain.User;
import com.gosaint.springcloudprovider.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/simple")

	public String hello(){
		return "www.baidu,com!";
	}
	@GetMapping("/echo")
	public List<User> hello2(){
		return userService.findByAll();
	}

}
