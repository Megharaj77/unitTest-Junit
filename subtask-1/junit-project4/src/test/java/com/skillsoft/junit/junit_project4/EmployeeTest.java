package com.skillsoft.junit.junit_project4;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeTest {


	static Employee firstEmployee;
	static Employee secondEmployee;
	
	@BeforeAll
	static void initEmployee() {
		firstEmployee = new Employee("Amy", "Cruz", 1001, 'F', "Developer", 50000, "Permanent");
		secondEmployee = new Employee("Brain", "Alford", 1011, 'M', "Developer",  45000, "Contract");
		
	}
	
//	@Test
//	void assertTest() {
////	assertTrue(firstEmployee.getRole().equals(secondEmployee.getRole()), "Test that both employees have the same role");
//	assertFalse(firstEmployee.getRole().equals(secondEmployee.getRole()), "Test that both employees have the same role");
//	}
	
	
	@Test
	void assertTest() {
		
		Employee firstShallowCopy = firstEmployee;
		Employee firstSeparateCopy = new Employee(firstEmployee.getFirstName(), firstEmployee.getLastName(), firstEmployee.getId(), firstEmployee.getGender(), 
				firstEmployee.getRole(), firstEmployee.getSalary(), firstEmployee.getType());
		
//		assertSame(firstEmployee,firstShallowCopy, "Test an Object and a Copy for sameness");
		
//		assertSame(firstEmployee,firstSeparateCopy, "Test an Object and a Copy for sameness");
		
//		assertSame(firstEmployee.getRole(),firstSeparateCopy.getRole(), "Test an Object and a Copy for sameness");
		
		assertNotSame(firstEmployee,firstShallowCopy, "Test an Object and a Copy for sameness");
	}
}
