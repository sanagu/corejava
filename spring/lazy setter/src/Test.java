package com.capgemini.assignment.spring.test;

import org.springframework.context.*;
import org.springframework.context.annotation.*;
import com.capgemini.assignment.spring.renderer.*;
import com.capgemini.assignment.spring.annotate.*;

	
	public class Test {

		public static void main(String[] args){
			ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
			System.out.println("ujhs");
			MessageRenderer mr = context.getBean(MessageRenderer.class);
			System.out.println("something");
			mr.render();
		}
	}

