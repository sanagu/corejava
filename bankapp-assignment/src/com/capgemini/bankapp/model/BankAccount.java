package com.capgemini.bankapp.model;

public class BankAccount {

	private long accountId;
	private String accHolderName;
	private String accountountType;
	private double accountBalance;
	/**
	 * 
	 */
	public BankAccount() {
		super();
		
	}
	
	public BankAccount(long accountId, String accHolderName, String accountountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accHolderName = accHolderName;
		this.accountountType = accountountType;
		this.accountBalance = accountBalance;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccountountType() {
		return accountountType;
	}

	public void setAccountountType(String accountountType) {
		this.accountountType = accountountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		if(accountBalance>=amount)
			accountBalance=accountBalance-amount;
		else
			System.out.println("u dont have sufficient fund");
		return accountBalance;
	}

	public double deposit(double amount) {
		// TODO Auto-generated method stub
	return	accountBalance=accountBalance+amount;
	}
	
	
}
