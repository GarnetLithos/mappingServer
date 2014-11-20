package com.mapping.server.consumption.model;

public class ConsumePost {
	String postId;
	String itemId;
	String itemName;
	String shopId;
	String ShopName;
	String location;
	String image;
	String price;
	String satisfactionPrice;
	String comment;
	
	public ConsumePost(){
		
	}

	public ConsumePost(String postId, String itemId, String itemName,
			String shopId, String shopName, String location, String image,
			String price, String satisfactionPrice, String comment) {
		super();
		this.postId = postId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.shopId = shopId;
		ShopName = shopName;
		this.location = location;
		this.image = image;
		this.price = price;
		this.satisfactionPrice = satisfactionPrice;
		this.comment = comment;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSatisfactionPrice() {
		return satisfactionPrice;
	}

	public void setSatisfactionPrice(String satisfactionPrice) {
		this.satisfactionPrice = satisfactionPrice;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
