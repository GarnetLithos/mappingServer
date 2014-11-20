package com.mapping.server.consumption.model;

public class Shop {
	String shopId;
	String shopName;
	String location;
	String grade;
	String gradeCount;
	String comment;
	String tags;
	
	public Shop(){
		
	}

	public Shop(String shopId, String shopName, String location,
			String grade, String gradeCount, String comment, String tags) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.location = location;
		this.grade = grade;
		this.gradeCount = gradeCount;
		this.comment = comment;
		this.tags = tags;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGradeCount() {
		return gradeCount;
	}

	public void setGradeCount(String gradeCount) {
		this.gradeCount = gradeCount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
	
}
