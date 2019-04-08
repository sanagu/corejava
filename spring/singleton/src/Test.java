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
			MessageRenderer mr1 = context.getBean(MessageRenderer.class);
			
			if(mr == mr1){
			System.out.println("singleton");
			System.out.println(mr.hashCode());
			System.out.println(mr1.hashCode());
			}
			else
			 
			System.out.println("not singleton");
			//java -cp  src;bin;lib/* com.capgemini.assignment.spring.test.Test
		
		}
	}

