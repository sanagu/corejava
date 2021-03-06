package com.capgemini.bankapp.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountNotFoundException;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.util.DbUtil;

public class BankAccountServiceImpl implements BankAccountService {
private BankAccountDao bankAccountDao;
static final Logger logger=Logger.getLogger(DbUtil.class);
	public BankAccountServiceImpl() {
		bankAccountDao = new BankAccountDaoImpl();
	}
	@Override
	public double checkBalance(long accountid) throws BankAccountNotFoundException {
		
		double balance=bankAccountDao.getBalance(accountid);
		if(balance>=0)
			return balance;
		else
			throw new BankAccountNotFoundException("BankAccount Doesn't exist");
	}

	@Override
	public double withdraw(long accountid, double amount) throws LowBalanceException,BankAccountNotFoundException {
	
		double balance=bankAccountDao.getBalance(accountid);
		if(balance < 0)
			throw new BankAccountNotFoundException("BankAccount Doesn't Exist");
		else if(balance-amount >= 0) {
			balance=balance-amount;
			bankAccountDao.updateBalance(accountid, balance);
		
			return balance;
		}
		else
		throw new LowBalanceException("You don't have sufficient funds");
	}

	public double withdrawFundTransfer(long accountid, double amount) throws LowBalanceException,BankAccountNotFoundException {
	
		double balance=bankAccountDao.getBalance(accountid);
		if(balance < 0)
			throw new BankAccountNotFoundException("BankAccount Doesn't Exist");
		else if(balance-amount >= 0) {
			balance=balance-amount;
			bankAccountDao.updateBalance(accountid, balance);
			DbUtil.commit();
			return balance;
		}
		else
		throw new LowBalanceException("You don't have sufficient funds");
	}

	@Override
	public double deposit(long accountid, double amount) throws BankAccountNotFoundException{
		double balance=bankAccountDao.getBalance(accountid);
		if(balance < 0)
			throw new BankAccountNotFoundException("Bankl Account doesnt exist");
		balance=balance+amount;
		bankAccountDao.updateBalance(accountid, balance);
		DbUtil.commit();
		return balance;
	}

	@Override
	public boolean deleteBankAccount(long accountid) throws BankAccountNotFoundException {
		boolean result=bankAccountDao.deleteBankAccount(accountid);
		if(result) {
			DbUtil.commit();
			return result;
		}
		throw new BankAccountNotFoundException("Bank account doesn't exist");
	}
	@Override
	public double fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalanceException,BankAccountNotFoundException {
		// TODO Auto-generated method stub
		try {
			double newBalance=withdraw(fromAccount,amount);
			
			deposit(toAccount,amount);
			DbUtil.commit();
			return newBalance;
		}catch(LowBalanceException | BankAccountNotFoundException e) {
			logger.error("Exception",e);
			DbUtil.rollback();
			throw e;
		}
		/*
		 * double balance1=bankAccountDao.getBalance(fromAccount); double
		 * balance2=bankAccountDao.getBalance(toAccount); if(balance1>=0 && balance2>=0)
		 * { double newBalance=balance1-amount; if(newBalance>=0) {
		 * bankAccountDao.updateBalance(fromAccount, newBalance);
		 * bankAccountDao.updateBalance(toAccount, balance2+amount); return newBalance;
		 * } else throw new LowBalanceException("You don't have sufficient fund"); }
		 * else throw new BankAccountNotFoundException("Bank account doesn't exist");
		 * 
		 */
		
	}
	@Override
	public boolean addNewBankAccount(BankAccount account)  {
		// TODO Auto-generated method stub
		boolean result= bankAccountDao.addNewBankAccount(account);	
		if(result) {
			DbUtil.commit();
			System.out.println("committed");
			return result;
		}
		return false;
	}
	@Override
	public List<BankAccount> findAllBankAccounts() {
		// TODO Auto-generated method stub
		List<BankAccount> result= bankAccountDao.findAllBankAccounts();
		if(!(result.isEmpty()))
			DbUtil.commit();
			return result;
	}
	@Override
	public List<BankAccount> serachBankAccount(long accountid) throws BankAccountNotFoundException {
		// TODO Auto-generated method stub
		List<BankAccount> account= bankAccountDao.serachBankAccount(accountid);
		if(!(account.isEmpty()))
			return account;
		throw new BankAccountNotFoundException("BankAccount doesn't exist");
					}
	@Override
	public boolean updateBankDetails(long accountid, String accountHolderName, String accountType) {

         
	boolean result= bankAccountDao.updateBankDetails(accountid, accountHolderName, accountType);
	if(result) 
		DbUtil.commit();
		return result;
	 
	}
	
	

}
