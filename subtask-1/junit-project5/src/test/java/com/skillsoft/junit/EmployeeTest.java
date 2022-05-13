package com.skillsoft.junit;




import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class EmployeeTest {


//	static Employee firstEmployee;
//	static Employee secondEmployee;
	
//	@BeforeAll
//	static void initEmployee() {
//		firstEmployee = new Employee("Amy", "Cruz", 1001, 'F', "Developer", 50000, "Permanent");
//		
//	}
	
//	@Test
//	void assertTest() {
//		assertTimeout(Duration.ofSeconds(5),
//				()->{firstEmployee.adjustSalary(2000);});
//	}
	
//	@Test
//	void assertTest() {
//		assertTimeout(Duration.ofSeconds(5),
//				()->{firstEmployee.adjustSalary(2000);
//				Employee secondEmployee = new Employee("Brain", "Alford", 1011, 'M', "Developer",  45000, "Contract");
//				secondEmployee.adjustSalary(20000);});
//	}
	
	
	/*assertNull*/
	
	static Employee firstEmployee;
	static Employee secondEmployee;
	
	@BeforeAll
	static void initEmployee() {
		firstEmployee = new Employee("Amy", "Cruz", 1001, 'F', "Developer", 50000, "Permanent");
		secondEmployee=null;
	}
	
	@Test
	void assertTest() {
//		assertNull(secondEmployee);
//		assertNull(firstEmployee);
		
		//not null
		
//		assertNotNull(firstEmployee);
		assertNotNull(secondEmployee);
	}
}
