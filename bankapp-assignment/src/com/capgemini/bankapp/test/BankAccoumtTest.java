package com.capgemini.bankapp.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import com.capgemini.bankapp.model.BankAccount;

public class BankAccoumtTest {
	private BankAccount account;

	@Before
	public void setUp() {
		account = new BankAccount(101, "john Doe", "saving", 35000);
	}

	@Test
	public void testBankAccountObjectIsCreatedwithDefaultConstructor() {
		BankAccount account = new BankAccount();
		assertNotNull(account);
	}

	@Test
	public void testBankAccountObjectIsCreatedwithParameterConstructor() {
		BankAccount account = new BankAccount(101, "john Doe", "saving", 35000);
		assertNotNull(account);
		assertEquals(101, account.getAccountId());
		assertEquals("john Doe", account.getAccHolderName());
		assertEquals("saving", account.getAccountountType());
		assertEquals(35000, account.getAccountBalance(), 0.01);
	}

	@Test
	public void testBankAccountCurrentBalance() {
		assertEquals(35000, account.getAccountBalance(), 0.01);
	}

	@Test
	public void testWithdrawSufficientFund() {
		account.withdraw(5000);
		assertEquals(30000, account.getAccountBalance(), 0.01);
	}

	@Test
	public void testWithdrawNotSufficientFund() {
		account.withdraw(45000);
		assertEquals(35000, account.getAccountBalance(), 0.01);
	}

	@Test
	public void testDeposit() {
		account.deposit(5000);
		assertEquals(40000, account.getAccountBalance(), 0.01);
	}
}
