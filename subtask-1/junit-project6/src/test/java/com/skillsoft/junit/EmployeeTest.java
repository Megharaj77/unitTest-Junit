package com.skillsoft.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.naming.InvalidNameException;
import javax.naming.NamingException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	static Employee firstEmployee;
	
	@BeforeAll
	static void initEmployee() {
		firstEmployee = new Employee("Susan", "4rester", 1005, 'F', "Tech Lead", 80000, "Permanent");
		
	}
	
//	@Test
//	void assertTest() {
//		
//		assertThrows(RuntimeException.class,
//				()->{firstEmployee.validateLastName();},"Throws Exception Test");
//	}
	
	

//	@Test
//	void assertTest() {
//		
//		assertThrows(InvalidNameException.class,
//				()->{firstEmployee.validateLastName();},"Throws Exception Test");
//	}

	
//	@Test
//	void assertTest() {
//		
//		assertThrows(NamingException.class,
//				()->{firstEmployee.validateLastName();},"Throws Exception Test");
//	}
	
	@Test
	void assertTest() {
		
		assertThrows(NullPointerException.class,
				()->{firstEmployee.validateLastName();},"Throws Exception Test");
	}

}
