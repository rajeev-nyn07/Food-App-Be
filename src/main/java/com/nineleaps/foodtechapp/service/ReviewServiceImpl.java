package com.nineleaps.foodtechapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.foodtechapp.entity.Review;
import com.nineleaps.foodtechapp.entity.User;
import com.nineleaps.foodtechapp.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements IReviewService {
	
	 @Autowired
	    private ReviewRepository reviewRepository;

	    @Override
	    public List<Review> getReviewsByUserId(Long userId) {
	        // Call the findByUserId method on the ReviewRepository to retrieve reviews by user ID
	        return reviewRepository.findByUserId(userId);
	    }
//	@Override
//	public Review addReviewByEmployee(Long orderId, Review review) {
//
//		Long vendorId = orderRepository.findById(orderId).get().getVendor().getUserId();
//
//        // Set the vendor ID for the review and save it
//        review.setUser(new User(userId));
//        return reviewRepository.save(review);
//	}
	

}
