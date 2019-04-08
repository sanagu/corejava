package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.files.client.model.BankAcc;
import com.capgemini.files.client.model.DebitCard;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DebitCard debitcard=new DebitCard(111222333444L,234,11,2021);
		BankAcc account=new BankAcc(101,"john","saving",34000,debitcard);
		
		FileOutputStream fileOutputStream=new FileOutputStream("account.ser");
		ObjectOutputStream outputStream=new  ObjectOutputStream(fileOutputStream);
		
		outputStream.writeObject(account);
		outputStream.close();
		FileInputStream fileInputStream=new FileInputStream("account.ser");
		ObjectInputStream inputStream=new  ObjectInputStream(fileInputStream);
		BankAcc account2=(BankAcc)inputStream.readObject();
		inputStream.close();
		System.out.println(account2);
	}
}
