package com.capgemini.exceptionhandle;

import org.junit.Test;

import com.capgemini.exceptionhandle.exception.FactorialException;
import com.capgemini.exceptionhandle.exception.InvalidInputException;
import com.capgemini.exceptionhandle.model.Factorial;

public class ExceptionTest {
	

	@Test(expected = FactorialException.class)
	public void testMethod1() throws FactorialException, InvalidInputException {
		Factorial f = new Factorial(1);
		f.fact();
	}
	@Test(expected = InvalidInputException.class)
	public void testMethod2() throws  InvalidInputException, FactorialException {
		Factorial f1 = new Factorial(123456);
		f1.fact();
	}

}
