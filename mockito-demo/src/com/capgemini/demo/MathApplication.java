package com.capgemini.demo;

import com.capgemini.demo.service.CalculatorService;
import com.capgemini.demo.test.InvalidInputException;

public class MathApplication {
	private CalculatorService service;

	/**
	 * @param service
	 */
	public MathApplication(CalculatorService service) {
	
		this.service = service;
	}
	
	public int performAddition(int number1,int number2) {
		return service.addition(number1, number2);
	}
	public int performSubtraction(int number1,int number2) {
		return service.subtraction(number1, number2);
	}
	public int performMultiplication(int number1,int number2) {
		return service.multiplication(number1, number2);
	}
	public int performDivision(int number1,int number2) {
		return service.division(number1, number2);
	}
	public long findFactorial(int number) throws InvalidInputException {
		return service.factorial(number);
	}
	public long findSquare(int number) {
		return service.square(number);
		
		
	}
}
