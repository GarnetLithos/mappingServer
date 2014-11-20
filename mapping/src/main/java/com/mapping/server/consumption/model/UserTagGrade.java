package com.mapping.server.consumption.model;

public class UserTagGrade {
	String userId;
	String tag;
	String grade;
	
	public UserTagGrade(){
		
	}

	public UserTagGrade(String userId, String tag, String grade) {
		super();
		this.userId = userId;
		this.tag = tag;
		this.grade = grade;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
