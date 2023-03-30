package com.nineleaps.foodtechapp.dto;

public class FoodItemRequest {
	
	 private String fooddItemName;

	    private Integer foodItemPrice;

	    private Long userId;
	    
	    private String foodItemTag;
	    
	    private String foodItemImgUrl;
	    
	    private String foodItemDscription;
	    private String foodItemType;
		public String getFoodItemName() {
			return fooddItemName;
		}
		public void setFooddItemName(String fooddItemName) {
			this.fooddItemName = fooddItemName;
		}
		public Integer getFoodItemPrice() {
			return foodItemPrice;
		}
		public void setFoodItemPrice(Integer foodItemPrice) {
			this.foodItemPrice = foodItemPrice;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
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
		public String getFoodItemDescription() {
			return foodItemDscription;
		}
		public void setFoodItemDescription(String foodItemDscription) {
			this.foodItemDscription = foodItemDscription;
		}
		public String getFoodItemType() {
			return foodItemType;
		}
		public void setFoodItemType(String foodItemType) {
			this.foodItemType = foodItemType;
		}
		public FoodItemRequest(String fooddItemName, Integer foodItemPrice, Long userId, String foodItemTag,
				String foodItemImgUrl, String foodItemDscription, String foodItemtype) {
			super();
			this.fooddItemName = fooddItemName;
			this.foodItemPrice = foodItemPrice;
			this.userId = userId;
			this.foodItemTag = foodItemTag;
			this.foodItemImgUrl = foodItemImgUrl;
			this.foodItemDscription = foodItemDscription;
			this.foodItemType = foodItemType;
		}
	
	    
	    
	    
	   

}
