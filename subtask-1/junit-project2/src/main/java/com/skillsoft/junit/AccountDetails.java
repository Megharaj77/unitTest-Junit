package com.skillsoft.junit;

public class AccountDetails {

	private String name;
	private int accountNumber;
	private Integer customerId;
	private int balance;
	private String accountType;
	
	public AccountDetails(String name, int accountNumber, Integer customerId, int balance, String accountType) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.customerId = customerId;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	
	
	public String getName() {
		return name;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public int getBalance() {
		return balance;
	}


	public String getAccountType() {
		return accountType;
	}
	
	public void deposite(int depositeAmount) {
		balance = balance + depositeAmount;
	}
	
	public boolean withdraw(int withdrawAmount) {
		
		if(withdrawAmount > balance) {
			System.out.println("Insufficient Funds");
			return false;
			
		} else {
			    balance = balance - withdrawAmount;
			    
			    return true;
		}
	}
	
}
