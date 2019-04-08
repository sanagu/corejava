package com.capgemini.lamda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lamda.model.Employee;

public class EmployeeClient {
	
	public static void main(String[] args) {
		/*
		 * Comparator<Employee> c=new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee e1,Employee e2) { return
		 * Integer.compare(e1.getEmployeeId(), e2.getEmployeeId()); }
		 * 
		 * };
		 */
		TreeSet<Employee> employees=new TreeSet<>((e1,e2)-> Integer.compare(e1.getEmployeeId(), e2.getEmployeeId()));
		employees.add(new Employee(101,"Alex","HR",34000));
		employees.add(new Employee(56,"Admin","Admin",12000));
		employees.add(new Employee(88,"Bob","Admin",5600));
		employees.add(new Employee(12,"Taylor","HR",12000));
		

		for(Employee employee:employees) {
			System.out.println(employee);
		}
}
}