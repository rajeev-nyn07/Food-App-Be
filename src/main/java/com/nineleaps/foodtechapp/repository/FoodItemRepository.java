package com.nineleaps.foodtechapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.foodtechapp.entity.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem,Long>{

	List<FoodItem> findByFoodItemName(String foodItemName);
	List<FoodItem> findByUserId(Long userId);
	

}