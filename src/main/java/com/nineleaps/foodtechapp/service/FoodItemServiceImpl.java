package com.nineleaps.foodtechapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.foodtechapp.dto.FoodItemRequest;
import com.nineleaps.foodtechapp.entity.FoodItem;
import com.nineleaps.foodtechapp.entity.User;
import com.nineleaps.foodtechapp.repository.FoodItemRepository;
import com.nineleaps.foodtechapp.repository.UserRepository;


@Service
public class FoodItemServiceImpl implements IFoodItemService{

	@Autowired
	private FoodItemRepository foodItemRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public FoodItem addFoodItem(Long userId, FoodItemRequest foodItemRequest) {
		
		  User user = userRepository.findById(userId).get();
	        FoodItem foodItem = new FoodItem();
	        foodItem.setFoodItemName(foodItemRequest.getFoodItemName());
	        foodItem.setFoodItemPrice(foodItemRequest.getFoodItemPrice());
	        foodItem.setFoodItemTag(foodItemRequest.getFoodItemTag());
	        foodItem.setFoodItemDescription(foodItemRequest.getFoodItemDescription());
	        foodItem.setFoodItemImgUrl(foodItemRequest.getFoodItemImgUrl());
	        foodItem.setFoodItemType(foodItemRequest.getFoodItemType());




	        
	        foodItem.setUser(user);
	        return foodItemRepository.save(foodItem);
		
	}
	@Override
	public FoodItem updateFoodItem(FoodItem foodItem) {
		
		return foodItemRepository.save(foodItem);
	}
	@Override
	public Optional<FoodItem> getFoodItemById(Long foodItemId) {
		// TODO Auto-generated method stub
		return foodItemRepository.findById(foodItemId);
	}
	@Override
	public void deleteFoodItemById(Long foodItemId) {
		// TODO Auto-generated method stub
		foodItemRepository.deleteById(foodItemId);;
	}
	@Override
	public List<FoodItem> getFoodItemByFoodName(String foodItemName) {
		
		return foodItemRepository.findByFoodItemName(foodItemName);
	}
	public List<FoodItem> getFoodItemsByUserId(Long userId) {
        return foodItemRepository.findByUserId(userId);
    }
	
}