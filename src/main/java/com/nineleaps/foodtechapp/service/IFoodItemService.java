package com.nineleaps.foodtechapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nineleaps.foodtechapp.dto.FoodItemRequest;
import com.nineleaps.foodtechapp.entity.FoodItem;
import com.nineleaps.foodtechapp.exception.ResourceNotFoundException;


public interface IFoodItemService {
	
	public FoodItem updateFoodItem(FoodItem foodItem);
	public Optional<FoodItem> getFoodItemById(Long foodItemId);
	public void deleteFoodItemById(Long foodItemId);
	public List<FoodItem> getFoodItemByFoodName(String foodItemName);
	public List<FoodItem> getFoodItemsByUserId(Long userId);
	public FoodItem addFoodItem(Long userId, FoodItemRequest foodItemRequest);

}
