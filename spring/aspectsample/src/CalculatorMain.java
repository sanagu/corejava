package com.capgemini.spring.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.aspect.*;
//import  com.capgemini.spring.organization.*;
import com.capgemini.spring.impl.*;
public class CalculatorMain{

	public static void main(String args[]){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = context.getBean(Calculator.class);
		calculator.add(1,2);
		calculator.divide(10,5);
	}
}