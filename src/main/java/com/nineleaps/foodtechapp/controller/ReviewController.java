package com.nineleaps.foodtechapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.foodtechapp.entity.Review;
import com.nineleaps.foodtechapp.service.IReviewService;
@CrossOrigin("*")
@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private IReviewService reviewService;
	
	
	
	@GetMapping("/vendor/{userId}")
    public List<Review> getReviewsByUserId(@PathVariable Long userId) {
        // Retrieve all reviews with the given vendor ID
        return reviewService.getReviewsByUserId(userId);
    }

//    @PostMapping("/employee/{orderId}")
//    public Review addReviewByEmployee(@PathVariable Long orderId, @RequestBody Review review) {
//        return reviewService.addReviewByEmployee(orderId,review);
//    }





	
	
}