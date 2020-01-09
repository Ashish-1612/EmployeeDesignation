package com.deloitte.main.model;

public class Admin {
	private int userId;
	private String name;
	final String userType = "admin";
	private String password;

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getUsertype() {
		return userType;
	}

	public String getPassword() {
		return password;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", name=" + name + ", userType=" + userType + ", password=" + password + "]";
	}

	

}
