package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;

class MangerTest {

	@Test
	public void testGrossSalaryManager() {
		Manager e=new Manager(123,"guru",50000,2000);

		
		assertEquals(89000,e.getGrossSalary(),0.02);
	}
	@Test
	public void testNetSalary() {
		Manager e=new Manager(123,"guru",50000,2000);
		assertEquals(82800, e.netSalary(),0.02);
	}
}
