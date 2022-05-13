package com.skillsoft.junit;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class AccountDetailsTest {

	AccountDetails accountDetails = new AccountDetails("Anitha4", 811401533, 114532, 5000, "Savings");
	
	@Test
	public void validateName() {
		assertTrue(accountDetails.getName().matches("^[a-zA-Z]*$"));
	}
	
	@Test
	public void validateBalance() {
		assertTrue(accountDetails.getBalance()>=0);
	}
}
