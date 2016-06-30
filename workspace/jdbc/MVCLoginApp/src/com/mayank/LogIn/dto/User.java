package com.mayank.LogIn.dto;

public class User {
	
	
	private String userId;
	
	private String userName;
	
	private String lastName;
	
	private String address;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void setUserId(String userId){
		this.userId=userId;
		
	}
	public String getUserId(){
		return userId;
	}

}
