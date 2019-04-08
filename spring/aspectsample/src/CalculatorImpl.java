package com.capgemini.spring.impl;

import com.capgemini.spring.aspect.*;
import org.springframework.stereotype.Component;


@Component
public class CalculatorImpl implements Calculator{

	@Override
	public void add(int n1,int n2){
		System.out.println(n1+n2);
	}

	@Override
	public void divide(int n1,int n2){
		System.out.println(n1/n2);
	}
}