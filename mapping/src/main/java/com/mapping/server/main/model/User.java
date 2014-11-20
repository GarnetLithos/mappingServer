package com.mapping.server.main.model;

public class User {
	String userId;
	String password;
	String selectedMaps;
	String recentShop;
	String recentItem;
	
	public User(){
		
	}

	public User(String userId, String password, String selectedMaps,
			String recentShop, String recentItem) {
		super();
		this.userId = userId;
		this.password = password;
		this.selectedMaps = selectedMaps;
		this.recentShop = recentShop;
		this.recentItem = recentItem;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSelectedMaps() {
		return selectedMaps;
	}

	public void setSelectedMaps(String selectedMaps) {
		this.selectedMaps = selectedMaps;
	}

	public String getRecentShop() {
		return recentShop;
	}

	public void setRecentShop(String recentShop) {
		this.recentShop = recentShop;
	}

	public String getRecentItem() {
		return recentItem;
	}

	public void setRecentItem(String recentItem) {
		this.recentItem = recentItem;
	}
	
	
}
