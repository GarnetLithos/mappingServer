package com.mapping.server.consumption.model;

public class UserConsumeLog {
	String logId;
	String userId;
	String shopId;
	String itemId;
	String satisfactionPercentage;
	String tags;
	
	public UserConsumeLog(){
		
	}
	
	public UserConsumeLog(String logId, String userId, String shopId,
			String itemId, String satisfactionPercentage, String tags) {
		super();
		this.logId = logId;
		this.userId = userId;
		this.shopId = shopId;
		this.itemId = itemId;
		this.satisfactionPercentage = satisfactionPercentage;
		this.tags = tags;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSatisfactionPercentage() {
		return satisfactionPercentage;
	}

	public void setSatisfactionPercentage(String satisfactionPercentage) {
		this.satisfactionPercentage = satisfactionPercentage;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
}
