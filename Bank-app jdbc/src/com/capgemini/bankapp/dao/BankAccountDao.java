package com.capgemini.bankapp.dao;


import java.util.List;

import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountDao {
	public double getBalance(long accountid);
	public void updateBalance(long accountid,double newBalance);
	public boolean deleteBankAccount(long accountid);
	public boolean addNewBankAccount(BankAccount account);
	public List<BankAccount> findAllBankAccounts();
	
	public List<BankAccount> serachBankAccount(long accountid);
	public boolean updateBankDetails(long accountid,String accountHolderName,String accountType);
	
}
