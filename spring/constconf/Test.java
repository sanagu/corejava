package com.capgemini.assignment.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.assignment.spring.renderer.*;
import com.capgemini.assignment.spring.annotate.*;

	
	public class Test {

		public static void main(String[] args){
			ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
			MessageRenderer mr =(MessageRenderer) context.getBean("renderer");
			mr.render();
		}
	}

