package com.mapping.server.consumption.model;

public class Item {
	String itemId;
	String itemName;
	String shopId;
	String location;
	String price;
	String satisfactionPercentage;
	String percentageCount;
	String tags;
	
	
	public Item(){
		
	}
	
	public Item(String itemId, String itemName, String shopId, String location,
			String price, String satisfactionPercentage,
			String percentageCount, String tags) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.shopId = shopId;
		this.location = location;
		this.price = price;
		this.satisfactionPercentage = satisfactionPercentage;
		this.percentageCount = percentageCount;
		this.tags = tags;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSatisfactionPercentage() {
		return satisfactionPercentage;
	}

	public void setSatisfactionPercentage(String satisfactionPercentage) {
		this.satisfactionPercentage = satisfactionPercentage;
	}

	public String getPercentageCount() {
		return percentageCount;
	}

	public void setPercentageCount(String percentageCount) {
		this.percentageCount = percentageCount;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
}
