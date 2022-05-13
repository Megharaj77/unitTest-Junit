package com.skillsoft.junit;

import javax.naming.InvalidNameException;

public class Employee {

	String firstName;
	String lastName;
	Integer id;
	Character gender;
	String role;
	int salary;
	String type;
	public Employee(String firstName, String lastName, Integer id, Character gender, String role, int salary,
			String type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.gender = gender;
		this.role = role;
		this.salary = salary;
		this.type = type;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Integer getId() {
		return id;
	}
	
	public Character getGender() {
		return gender;
	}
	
	public String getRole() {
		return role;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getType() {
		return type;
	}
	
	public void adjustSalary(int adjAmount) {
		salary = salary + adjAmount;
	}
	
//    public void validateLastName() throws Exception{
//    	
//    	if(!this.lastName.matches("^[a-zA-z]*$")) {
//    		throw new RuntimeException("The last name only contain alphabets");
//    	}
//    }
	
	 public void validateLastName() throws Exception{
	    	
	    	if(!this.lastName.matches("^[a-zA-z]*$")) {
	    		throw new InvalidNameException("The last name only contain alphabets");
	    	}
	 }
}
