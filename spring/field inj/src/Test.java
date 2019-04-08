package com.capgemini.assignment.spring.test;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.assignment.spring.renderer.*;
public class Test {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MessageRenderer mr =(MessageRenderer) context.getBean(MessageRenderer.class);
		mr.render();
		}
}