package com.xception.main;

import java.io.FileNotFoundException;

import com.xception.main.test.FilesException;

public class Xception extends Exception{
	public int method1(int p) throws FileNotFoundException,FilesException {
		method2();
		
		return p;
	}
	public void method2() throws FileNotFoundException,FilesException {
		method3();
	}
	public void method3() throws FileNotFoundException ,FilesException {
		throw new FileNotFoundException();
	    // throw new FilesException();
	}
	public static void main(String[] args) {
		try {
			Xception c=new Xception();
			c.method1(20);
			System.out.println("guruq");
			System.out.println("gurup");
		}
		catch(FileNotFoundException e) {
			System.out.println("guru");
		}
		catch(FilesException e) {
			System.out.println("guru");
		}
		System.out.println("guru");
	}

}
