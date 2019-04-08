package com.capgemini.files.client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MyClassSerialization {

	public boolean testSerilizable(String s, ArrayList<MyClass> set) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs=new FileOutputStream(s);
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(set);
		os.close();
		return true;
	}
	

}
