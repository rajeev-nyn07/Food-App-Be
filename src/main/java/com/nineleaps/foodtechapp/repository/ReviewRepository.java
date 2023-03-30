package com.nineleaps.foodtechapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.foodtechapp.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

	List<Review> findByUserId(Long userId);
	
	

}
