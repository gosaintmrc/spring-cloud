package com.gosaint.springcloudprovider.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gosaint.springcloudprovider.dao.UserRepository;
import com.gosaint.springcloudprovider.domain.User;
import com.gosaint.springcloudprovider.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findByAll() {
		
		return userRepository.findAll();
	}
	
	
}
