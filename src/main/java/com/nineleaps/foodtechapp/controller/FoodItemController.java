package com.nineleaps.foodtechapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.foodtechapp.dto.FoodItemRequest;
import com.nineleaps.foodtechapp.entity.FoodItem;
import com.nineleaps.foodtechapp.exception.ResourceNotFoundException;
import com.nineleaps.foodtechapp.service.IFoodItemService;

@RestController
@RequestMapping("/users")

public class FoodItemController {
	
	
	@Autowired
	private IFoodItemService foodItemService;
	
	 @GetMapping("/users/{vendorId}")
	    public ResponseEntity<List<FoodItem>> getAllFoodItemsByVendorId(@PathVariable Long vendorId) {
	        List<FoodItem> foodItems = foodItemService.getFoodItemsByUserId(vendorId);
	        return new ResponseEntity<>(foodItems, HttpStatus.OK);
	    }
	
	 @PostMapping("/users/{vendorId}")
	    public ResponseEntity<FoodItem> addFoodItem(@PathVariable Long vendorId, @RequestBody FoodItemRequest foodItemRequest) {
	        FoodItem foodItem = foodItemService.addFoodItem(vendorId, foodItemRequest);
	        return new ResponseEntity<>(foodItem, HttpStatus.CREATED);
	    }
	
	@PutMapping("/updatefooditem/{fid}")///
	public FoodItem updateFoodItem(@RequestBody FoodItem newFoodItem,@PathVariable("pid") Long foodItemId){
	  FoodItem foodItem = foodItemService.getFoodItemById(foodItemId).get();
	  
	  foodItem.setFoodItemName(newFoodItem.getFoodItemName());
	  foodItem.setFoodItemPrice(newFoodItem.getFoodItemPrice());
	 foodItem.setFoodItemType(newFoodItem.getFoodItemType());
	 foodItem.setFoodItemDescription(newFoodItem.getFoodItemDescription());
	 foodItem.setFoodItemTag(newFoodItem.getFoodItemTag());
	 foodItem.setFoodItemImgUrl(newFoodItem.getFoodItemDescription());
	 
		return foodItemService.updateFoodItem(foodItem);
    }
	@GetMapping("/findfooditem/{fid}")
	public FoodItem getFoodItemById(@PathVariable("fid") Long foodItemId){
		return foodItemService.getFoodItemById(foodItemId).get();
	}
	@DeleteMapping("/deletefooditem/{pid}")
	public void deleteFoodItemById(@PathVariable("pid") Long foodItemId){
		foodItemService.deleteFoodItemById(foodItemId);
	}
	
	@GetMapping("/findfoodname/{foodname}")
	public List<FoodItem> getFoodItemByFoodName(@PathVariable("foodname") String foodItemName) {
		return foodItemService.getFoodItemByFoodName(foodItemName);
	}
	
	
	

	
	

}
