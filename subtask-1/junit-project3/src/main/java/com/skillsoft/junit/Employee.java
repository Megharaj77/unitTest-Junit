package com.skillsoft.junit;

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
	
	
}
