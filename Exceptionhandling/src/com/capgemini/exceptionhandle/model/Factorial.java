package com.capgemini.exceptionhandle.model;

import com.capgemini.exceptionhandle.exception.FactorialException;
import com.capgemini.exceptionhandle.exception.InvalidInputException;

public class Factorial extends Exception {
	int num;

	public Factorial(int num) {
		super();
		this.num = num;
	}

	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long fact() throws FactorialException, InvalidInputException {
		if (this.num < 2) {
			throw new FactorialException("num is less than two");
		}
		long p = 1;
		for (int i = this.num; i > 0; i--) {
			p = p * this.num;
			if(p>Integer.MAX_VALUE)  {
				throw new InvalidInputException("number exceeds integer.max");
			}
		}
		
		return p;

	}

}
