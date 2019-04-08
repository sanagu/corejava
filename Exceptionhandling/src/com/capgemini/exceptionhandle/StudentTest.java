package com.capgemini.exceptionhandle;

import org.junit.Test;

import com.capgemini.exceptionhandle.exception.AgeNotWithinRangeException;
import com.capgemini.exceptionhandle.exception.NameNotValidException;
import com.capgemini.exceptionhandle.model.Student;

public class StudentTest {
	
	@Test(expected=AgeNotWithinRangeException.class)
	public void method1() throws AgeNotWithinRangeException {
		
		Student s=new Student(0, null, 14, null);
		
		s.checkAge();
	}
	@Test(expected=NameNotValidException.class)
	public void method2() throws  NameNotValidException{
		
		Student s1=new Student(0, "guru99", 0, null);
		
		s1.checkName();
	}
}
