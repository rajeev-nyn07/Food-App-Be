package com.nineleaps.foodtechapp.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.nineleaps.foodtechapp.entity.Review;

public interface IReviewService {

	public List<Review> getReviewsByUserId(Long userId);

//	public Review addReviewByEmployee(Long orderId, Review review);
	
}
