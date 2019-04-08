package com.capgemini.files.client.model;

import java.io.Serializable;

public class BankAcc implements Serializable {
	private int accountid;
	private  String accontHolderName;
	private String accountType;
	private double accountBalance;
	private DebitCard debitcard;
	/**
	 * 
	 */
	public BankAcc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankAcc [accountid=" + accountid + ", accontHolderName=" + accontHolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + ", debitcard=" + debitcard + "]";
	}
	/**
	 * @param accountid
	 * @param accontHolderName
	 * @param accountType
	 * @param accountBalance
	 * @param debitcard
	 */
	public BankAcc(int accountid, String accontHolderName, String accountType, double accountBalance,
			DebitCard debitcard) {
		super();
		this.accountid = accountid;
		this.accontHolderName = accontHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.debitcard = debitcard;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccontHolderName() {
		return accontHolderName;
	}
	public void setAccontHolderName(String accontHolderName) {
		this.accontHolderName = accontHolderName;
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
	public DebitCard getDebitcard() {
		return debitcard;
	}
	public void setDebitcard(DebitCard debitcard) {
		this.debitcard = debitcard;
	}
	
}
