package com.example.myproject;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class Employee {
	private String eid;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eid, String firstName, String lastName, String gender, String department, String email) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.department = department;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
