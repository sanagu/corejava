package com.capgemini.lamda.client;

import com.capgemini.lamda.model.Calculator;

public interface CalculatorClient {
	public static void  main(String[] args) {
		Calculator add=(x,y)->x+y;
	
		int x;
		int y;
		System.out.println(add.calculate(x, y));
	}

}
