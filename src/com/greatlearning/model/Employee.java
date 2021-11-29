package com.greatlearning.model;

public class Employee {
	//Declare firstname, lastname,department
	
	private String firstname;
	private String lastname;
	private String department;
	
	//Create a constructor
	public Employee(String firstname, String lastname, String department) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.setdepartment(department);
	}
	
	//Create getters and setters
	// getter and setter for firstname
	
	public String getfirstname() {
		return firstname;
	}	
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	
	//getter and setter for lastname
	
	public String getlastname() {
		return lastname;
	}	
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	//getter and setter for department
	
	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}
	
}
