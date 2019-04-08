package com.capgemini.files.client.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


import com.capgemini.files.client.Employee;

public class DeserializationEmployee {

	public Object doDeserialization(String st) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

        FileInputStream fis = new FileInputStream(st);
        ObjectInputStream ois = new ObjectInputStream(fis);
      

     Employee employee = (Employee) ois.readObject();
     ois.close();
		return employee;
	}
	
}
