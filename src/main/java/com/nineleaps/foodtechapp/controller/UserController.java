package com.nineleaps.foodtechapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.foodtechapp.entity.User;
import com.nineleaps.foodtechapp.service.IUserService;

import antlr.collections.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

   

    // Get user by id
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    // Create user
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userService.insertUser(user);
    }


    
}

