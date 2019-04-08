package com.capgemini.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.util.DbUtil;

public class BankAccountDaoImpl implements BankAccountDao {

	@Override
	public double getBalance(long accountid) {
		String query = "select account_balance from bankaccounts1 where account_id=" + accountid;
		double balance = -1;
		Connection connection = DbUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
			if(result.next())
			balance = result.getDouble(1);
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return balance;
	}

	@Override
	public void updateBalance(long accountid, double newBalance) {
		// TODO Auto-generated method stub
		String query = "Update  bankaccounts1 set account_balance = ? where account_id=?";
		Connection connection = DbUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setDouble(1, newBalance);
			statement.setLong(2, accountid);

			int result = statement.executeUpdate();
			System.out.println("no:of rows updated:" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean deleteBankAccount(long accountid) {
		// TODO Auto-generated method stub
		String query = "Delete  from bankaccounts1 where account_id=" + accountid;
		int result;
		Connection connection = DbUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			result = statement.executeUpdate();
			if (result == 1)
				return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		String query = "insert into bankaccounts1 (customer_name, account_type, account_balance) values (?,?,?)";
		Connection connection = DbUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, account.getAccountHolderName());
			statement.setString(2, account.getAccountType());
			statement.setDouble(3, account.getAccountBalance());

			int result = statement.executeUpdate();
			System.out.println(result);
			if (result == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<BankAccount> findAllBankAccounts() {
		// TODO Auto-generated method stub
		String query = "select * from bankaccounts1";
		List<BankAccount> accounts = new ArrayList<>();
		Connection connection = DbUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
			while (result.next()) {
				long accountId = result.getLong(1);
				String accountHolderName = result.getString(2);
				String accountType = result.getString(3);
				double accountBalance = result.getDouble(4);
				BankAccount account = new BankAccount(accountId, accountHolderName, accountType, accountBalance);
				accounts.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return accounts;
	}

	@Override
	public List<BankAccount> serachBankAccount(long accountid) {
		String query="select * from bankaccounts1 where account_id = "+accountid;
		List<BankAccount> accounts = new ArrayList<>();
		Connection connection = DbUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
				result.next();
				long accountId = result.getLong(1);
				String accountHolderName = result.getString(2);
				String accountType = result.getString(3);
				double accountBalance = result.getDouble(4);
				BankAccount account = new BankAccount(accountId, accountHolderName, accountType, accountBalance);
				accounts.add(account);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return accounts;
		
	}

	@Override
	public boolean updateBankDetails(long accountid, String accountHolderName, String accountType) {
		// TODO Auto-generated method stub
	   	
		String query="update bankaccounts1 set customer_name=?,account_type=? where account_id=?";
		Connection connection = DbUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)){
			statement.setString(1, accountHolderName);
			statement.setString(2, accountType);
			statement.setLong(3, accountid);
			int result = statement.executeUpdate();
			System.out.println("no:of rows updated:" + result);
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
