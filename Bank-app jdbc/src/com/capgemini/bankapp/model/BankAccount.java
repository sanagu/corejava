package com.capgemini.bankapp.model;

public class BankAccount {
	private long accountid;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	/**
	 * 
	 */
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param accountHolderName
	 * @param accountType
	 * @param accountBalance
	 */
	public BankAccount(String accountHolderName, String accountType, double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	/**
	 * @param accountid
	 * @param accountHolderName
	 * @param accountType
	 * @param accountBalance
	 */
	public BankAccount(long accountid, String accountHolderName, String accountType, double accountBalance) {
		super();
		this.accountid = accountid;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public long getAccountid() {
		return accountid;
	}
	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountid=" + accountid + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + "]";
	}
	

}
