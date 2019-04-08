package com.capgemini.files.client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistEmployee {
	

	public boolean PersistEmployee(String s, Employee employee) throws IOException {
		// TODO Auto-generated constructor stub
		 FileOutputStream fos = new FileOutputStream(s);
		 
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(employee);
		    oos.close();
		    return true;
	}
	
}
