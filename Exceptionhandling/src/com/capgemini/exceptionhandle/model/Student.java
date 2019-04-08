package com.capgemini.exceptionhandle.model;

import com.capgemini.exceptionhandle.exception.AgeNotWithinRangeException;
import com.capgemini.exceptionhandle.exception.NameNotValidException;

public class Student extends Exception {
	long rollno;
	String name;
	int age;
	String course;
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param rollno
	 * @param name
	 * @param age
	 * @param course
	 */
	public Student(long rollno, String name, int age, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public int checkAge() throws AgeNotWithinRangeException {
		if((this.age)>15&&(this.age)<21) {
			return this.age;
		}
		else {
			throw new AgeNotWithinRangeException();
		}
	}
	public String checkName() throws NameNotValidException {
		 if((this.name).matches("^.*[^a-zA-Z ]{9}.*$") == false){
			 throw new NameNotValidException("it contains special characters");
		 }
		 else
			 return this.name;
	}
	
}
