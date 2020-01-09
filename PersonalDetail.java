package com.deloitte.main.model;

public class PersonalDetail {
	private int userId;
	private String email;
	private String name;
	private String fatherName;
	private String motherName;
	private String address;
	private long contactNo;
	private String gender;
	private String password;
	private String designation;
	private double salaryPackage;

	@Override
	public String toString() {
		return "PersonalDetail [userId=" + userId + ", name=" + name + ", email=" + email + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", address=" + address + ", contactNo=" + contactNo + ", gender="
				+ gender + ", password=" + password + ", designation=" + designation + ", salaryPackage="
				+ salaryPackage + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalaryPackage() {
		return salaryPackage;
	}

	public void setSalaryPackage(double salaryPackage) {
		this.salaryPackage = salaryPackage;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
