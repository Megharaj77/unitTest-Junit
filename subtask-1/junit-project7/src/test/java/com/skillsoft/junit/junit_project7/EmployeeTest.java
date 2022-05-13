package com.skillsoft.junit.junit_project7;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.LinkedList;

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
//		firstEmployee.adjustSalary(2000);
//		
//		assertAll("Test Employee",
//				() -> assertEquals(82000, firstEmployee.getSalary()),
//				() -> assertNotNull(firstEmployee.getFirstName()),
//				() -> assertThrows(NullPointerException.class,
//						()-> {firstEmployee.validateLastName();},"Throws Exception"));
//	}
	
	
//	@Test
//	void assertTest() {
//		firstEmployee.addProjects("Blue Flames");
//		firstEmployee.addProjects("Black box");
//		
//		ArrayList<String> compareList = new ArrayList<>();
//		compareList.add("Blue Flames");
//		compareList.add("Black box");
//		
//		assertIterableEquals(compareList,firstEmployee.getProjects());
//	}
	
	@Test
	void assertTest() {
		firstEmployee.addProjects("Blue Flames");
		firstEmployee.addProjects("Black box");
		
		LinkedList<String> compareList = new LinkedList<>();
		compareList.add("Blue Flames");
		compareList.add("Black box");
		
		assertIterableEquals(compareList,firstEmployee.getProjects());
	}

}
