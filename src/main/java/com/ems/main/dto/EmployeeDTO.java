package com.ems.main.dto;

import com.ems.main.model.Employee;

public class EmployeeDTO {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	private String empId;
	private String bloodGp;
	private int age;
	private String personalEmail;
	private String mobileNo;
	
	public EmployeeDTO() {		
	}
	
	public EmployeeDTO(Employee employee) {
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.userName = employee.getUserName();
		this.emailId = employee.getEmailId();
		this.empId = employee.getEmpId();
		this.bloodGp = employee.getBloodGp();
		this.age = employee.getAge();
		this.personalEmail = employee.getPersonalEmail();
		this.mobileNo = employee.getMobileNo();
		this.id = employee.getId();
	}
	
	public EmployeeDTO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getBloodGp() {
		return bloodGp;
	}


	public void setBloodGp(String bloodGp) {
		this.bloodGp = bloodGp;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPersonalEmail() {
		return personalEmail;
	}


	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
