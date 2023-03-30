package com.nineleaps.foodtechapp.service;

import java.util.List;


import com.nineleaps.foodtechapp.entity.User;
public interface IUserService {

	public User getUserById(Long userId);

	public User insertUser(User newUser);

}
