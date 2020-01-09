package com.deloitte.main.model;

public class UserInfo {

	private int userId;
	private String userType;
	private String password;

	public UserInfo() {

	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userType=" + userType + ", password=" + password + "]";
	}
	

}
