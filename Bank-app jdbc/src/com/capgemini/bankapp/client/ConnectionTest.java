package com.capgemini.bankapp.client;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public static void main(String[] args) {
	
		String dburl="jdbc:mysql://localhost:3306/bankappdb";
		String username="root";
		String password="root";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(dburl, username, password);
		if(connection!=null)
			System.out.println("--connected--");
		}
		catch(ClassNotFoundException e){
			System.out.println("Failed to load Driverclass.Make sure that .class file is available");
		}
		catch(Exception e){
			System.out.println("Failed to connect--");
					e.printStackTrace();
		}
	}
}
