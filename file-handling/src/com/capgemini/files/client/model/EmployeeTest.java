package com.capgemini.files.client.model;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.Employee;
import com.capgemini.files.client.PersistEmployee;
import com.capgemini.files.client.client.DeserializationEmployee;

public class EmployeeTest {
	private Employee employee;
	private PersistEmployee employeeSerialization;
	private DeserializationEmployee employeeDeserialization;
	@Test
	public void testSerialization() throws IOException {
		employee=new Employee(101,"john doe",45000);
		employeeSerialization=new PersistEmployee();
		assertEquals(true, employeeSerialization.PersistEmployee("emp.ser",employee));
	}
	@Test
	public void testDeSerialization() throws IOException, ClassNotFoundException {
		employee=new Employee(101,"john doe",45000);
		employeeDeserialization=new DeserializationEmployee();
		assertEquals(employee, employeeDeserialization.doDeserialization("emp.ser"));
	}
}
