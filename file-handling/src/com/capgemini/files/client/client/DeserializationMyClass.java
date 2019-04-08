package com.capgemini.files.client.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.capgemini.files.client.MyClass;



public class DeserializationMyClass {
	

	public Object doDesrialization(String s) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fs=new FileInputStream(s);
		ObjectInputStream os=new ObjectInputStream(fs);
		ArrayList<MyClass> p=(ArrayList<MyClass>) os.readObject();
		return p;
		
	}
}
