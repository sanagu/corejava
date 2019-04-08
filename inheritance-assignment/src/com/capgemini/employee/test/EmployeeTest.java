package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;


import com.capgemini.employee.model.Employee;

public class EmployeeTest {
	private Employee employee;
	@Before
	public void setUp() {
	 employee=new Employee(123,"guru",50000,2000);
	}
	
		@Test                                                                  
		public void testEmployeeObjectIsCreatedConstructor() {   
			Employee employee= new Employee();                           
			assertNotNull(employee);                                            
		}  
		
		@Test
		public void objectCheck() {
			//employee=new Employee(123,"guru",20000,5000);
			assertEquals(123,employee.getEmployeeId());
			assertEquals("guru", employee.getEmployeeName());
			assertEquals(50000, employee.getBasicSalary(),0.01);
			assertEquals(2000, employee.getMedical(),0.02);
		}
		
		@Test
		public void checkGossNetSalary() {
			//employee=new Employee(123,"guru",20000,5000);
		assertEquals(77000,	employee.getGrossSalary(),0.01);
			assertEquals(70800,employee.getNetSalary(),0.02);
		}
}
