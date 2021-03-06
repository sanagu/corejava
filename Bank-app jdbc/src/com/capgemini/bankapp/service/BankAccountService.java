package com.capgemini.bankapp.service;

import java.util.List;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountService {
	public double checkBalance(long accountid) throws BankAccountNotFoundException;
	public double withdraw(long accountid,double amount)throws LowBalanceException,BankAccountNotFoundException;
	public double deposit(long accountid,double amount) throws BankAccountNotFoundException;
	public boolean deleteBankAccount(long accountid) throws BankAccountNotFoundException;
	public double fundTransfer(long fromAccount,long toAccount,double amount) throws LowBalanceException,BankAccountNotFoundException;
	public boolean addNewBankAccount(BankAccount account);
	public List<BankAccount> findAllBankAccounts();
	public List<BankAccount> serachBankAccount(long accountid) throws BankAccountNotFoundException;
	public boolean updateBankDetails(long accountid,String accountHolderName,String accountType);
}
