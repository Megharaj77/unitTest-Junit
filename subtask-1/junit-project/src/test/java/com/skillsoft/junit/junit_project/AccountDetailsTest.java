package com.skillsoft.junit.junit_project;

public class AccountDetailsTest {

	AccountDetails accountDetails = new AccountDetails("Anitha4", 811401533, 114532, 5000, "Savings");
	
	void validateName() {
		
		if(accountDetails.getName().matches("^[a-zA-Z]*$")) {
			System.out.println("Test passed : Name is Valid");
		} else {
			System.out.println("Test failed : Name is invalid");
		}
	}
	
	public static void main(String[] args) {
		
		AccountDetailsTest accountDetailsTest = new AccountDetailsTest();
		accountDetailsTest.validateName();
	}
}

