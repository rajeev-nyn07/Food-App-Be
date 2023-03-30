package com.nineleaps.foodtechapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.foodtechapp.entity.User;
import com.nineleaps.foodtechapp.repository.UserRepository;
@Service


public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepo;
	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).get();
	}

	@Override
	public User insertUser(User newUser) {
		// TODO Auto-generated method stub
		return userRepo.save(newUser);
	}

}
