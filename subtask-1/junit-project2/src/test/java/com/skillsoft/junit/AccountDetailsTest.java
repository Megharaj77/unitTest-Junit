package com.skillsoft.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//public class AccountDetailsTest {
//
//	AccountDetails accountDetails;
//	
//	@BeforeAll
//	static void initAll() {
//		System.out.println("@BeforeAll block as been executed");
//		System.out.println("Intitalizing All");
//	}
//	
//	@BeforeEach
//	void init() {
//		accountDetails = new AccountDetails("Anitha", 811401533, 114532, 5000, "Savings");
//		
//		System.out.println("@BeforeEach block has been executed");
//		System.out.println("Account balance: " + accountDetails.getBalance());
//	}
//	
//	@Test
//	void depositeTest() {
//		accountDetails.deposite(500);
//		System.out.println("@Test block for deposite has been executed");
//	}
//	
//	@Test
//	void withdrawTest() {
//		accountDetails.withdraw(1000);
//		System.out.println("@Test block for withdraw has been executed");
//	}
//	
//	@AfterEach
//	void balance() {
//		System.out.println("@AfterEach has been executed");
//		System.out.println("Account balance: "+ accountDetails.getBalance());
//	}
//	
//	@AfterAll
//	static void teardownAll() {
//		System.out.println("@AfterAll block as been executed");
//		System.out.println("Clear All");
//	}
//}







public class AccountDetailsTest {

	static AccountDetails accountDetails;
	
	@BeforeAll
	static void initAll() {
       accountDetails = new AccountDetails("Anitha", 811401533, 114532, 5000, "Savings");
		System.out.println("Account balance: " + accountDetails.getBalance());
		System.out.println("@BeforeAll block as been executed");
		
	}
	
	
	@Test
	void depositeTest() {
		accountDetails.deposite(500);
		System.out.println("@Test block for deposite has been executed");
	}
	
	@Test
	void withdrawTest() {
		accountDetails.withdraw(1000);
		System.out.println("@Test block for withdraw has been executed");
	}
	
	@AfterEach
	void balance() {
		System.out.println("@AfterEach has been executed");
		System.out.println("Account balance: "+ accountDetails.getBalance());
	}
	
	@AfterAll
	static void teardownAll() {
		System.out.println(" Final Account balance: "+ accountDetails.getBalance());
		accountDetails=null;
		System.out.println("Clear All");
	}
}

