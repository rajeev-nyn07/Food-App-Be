package com.nineleaps.foodtechapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
@Table(name= "food_item")
public class FoodItem {
	@Autowired
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="food_id")
	  private Long foodItemId;
	
	
	@Column(name = "food_item_name", nullable = false)
	private String foodItemName;
	@Column(name = "food_item_type",nullable = false)
	private String foodItemType;
	@Column(name = "food_item_price",nullable = false)
	private Integer foodItemPrice;
	
	@Column(name = "food_item_description",nullable = false)
	private String foodItemDescription;
	
	@Column(name = "food_item_tag",nullable = false)
	private String foodItemTag;
	
	
	@Column(name = "food_item_imgurl",nullable = false)
	private String foodItemImgUrl;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	 private User user;
	
	
	public FoodItem() {

	}


	public Long getFoodItemId() {
		return foodItemId;
	}


	public void setFoodItemId(Long foodItemId) {
		this.foodItemId = foodItemId;
	}


	public String getFoodItemName() {
		return foodItemName;
	}


	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}


	public String getFoodItemType() {
		return foodItemType;
	}


	public void setFoodItemType(String foodItemType) {
		this.foodItemType = foodItemType;
	}



	public Integer getFoodItemPrice() {
		return foodItemPrice;
	}


	public void setFoodItemPrice(double d) {
		this.foodItemPrice = (int) d;
	}


	


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	


	public FoodItem(Long foodItemId, String foodItemName, String foodItemType, Integer foodItemPrice,
			String foodItemDescription, String foodItemTag, String foodItemImgUrl, Long userId) {
		super();
		this.foodItemId = foodItemId;
		this.foodItemName = foodItemName;
		this.foodItemType = foodItemType;
		this.foodItemPrice = foodItemPrice;
		this.foodItemDescription = foodItemDescription;
		this.foodItemTag = foodItemTag;
		this.foodItemImgUrl = foodItemImgUrl;
		this.user = user;
	}


	public String getFoodItemDescription() {
		return foodItemDescription;
	}


	public void setFoodItemDescription(String foodItemDescription) {
		this.foodItemDescription = foodItemDescription;
	}


	public String getFoodItemTag() {
		return foodItemTag;
	}


	public void setFoodItemTag(String foodItemTag) {
		this.foodItemTag = foodItemTag;
	}


	public String getFoodItemImgUrl() {
		return foodItemImgUrl;
	}


	public void setFoodItemImgUrl(String foodItemImgUrl) {
		this.foodItemImgUrl = foodItemImgUrl;
	}


	@Override
	public String toString() {
		return "FoodItem [foodItemId=" + foodItemId + ", foodItemName=" + foodItemName + ", foodItemType="
				+ foodItemType + ", foodItemPrice=" + foodItemPrice + ", foodItemDescription=" + foodItemDescription
				+ ", foodItemTag=" + foodItemTag + ", foodItemImgUrl=" + foodItemImgUrl + ", user=" + user
				+ "]";
	}


	


	

}
