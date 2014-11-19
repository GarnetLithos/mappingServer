package com.mapping.server.common.model;

public class TestObject {
	int testInt;
	String testString;
	
	public TestObject(){
		
	}
	
	public TestObject(int testInt, String testString){
		this.testInt = testInt;
		this.testString = testString;
	}

	public int getTestInt() {
		return testInt;
	}

	public void setTestInt(int testInt) {
		this.testInt = testInt;
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}
	
}
