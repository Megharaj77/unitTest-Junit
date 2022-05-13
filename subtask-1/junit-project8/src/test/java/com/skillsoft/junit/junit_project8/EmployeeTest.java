package com.skillsoft.junit.junit_project8;




import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	static Employee employee;
	static GregorianCalendar gc;
	
	
	@BeforeAll
	static void initEmployee() {
		employee = new Employee("Susan", "Forrester", 1005, 'F', "Tech Lead", 80000, "Permanent");
		
		gc = new GregorianCalendar();
	}
	
//	@Test
//	void assumptionTest() {
//		System.out.println("Current hour : " + gc.get(Calendar.HOUR_OF_DAY));
//		
//		Assumptions.assumeTrue(gc.get(Calendar.HOUR_OF_DAY)<17);
//		
//		employee.adjustSalary(5000);
//		assertEquals(85000, employee.getSalary());
//		
//		System.out.println("Assumption was satisified and test was run");
//		
//	}
	
//	@Test
//	void assumptionTest() {
//		System.out.println("Current hour : " + gc.get(Calendar.HOUR_OF_DAY));
//		
//		Assumptions.assumeTrue(gc.get(Calendar.HOUR_OF_DAY)<20);
//		
//		employee.adjustSalary(5000);
//		assertEquals(89000, employee.getSalary());
//		
//		System.out.println("Assumption was satisified and test was run");
//		
//	}

//	
//	@Test
//	void assumptionTest() {
//		System.out.println("Current hour : " + gc.get(Calendar.HOUR_OF_DAY));
//		
//		Assumptions.assumeFalse(gc.get(Calendar.HOUR_OF_DAY)<20);
//		
//		employee.adjustSalary(5000);
//		assertEquals(89000, employee.getSalary());
//		
//		System.out.println("Assumption was satisified and test was run");
//		
//	}
	

	@Test
	void assumptionTest() {
		System.out.println("Current hour : " + gc.get(Calendar.HOUR_OF_DAY));
		
		Assumptions.assumingThat(gc.get(Calendar.HOUR_OF_DAY)<18,
				()->{employee.adjustSalary(5000);
				assertEquals(89000, employee.getSalary());
				System.out.println("Assumption was satisified and test was run");});
		
		System.out.println("\n After invocation of assumption");
		
		
		
		
		
		
	}

}
