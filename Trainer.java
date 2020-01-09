package com.deloitte.main.model;

public class Trainer  {
	private int userId;
	private long contactNo;
	private String specialization;

	public Trainer() {
		super();
	}

	public Trainer(String name, String eMail, int userId, String userType, String password, long contactNo,
			String specialization) {
		
		this.contactNo = contactNo;
		this.specialization = specialization;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
