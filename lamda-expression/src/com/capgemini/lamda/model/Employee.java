package com.capgemini.lamda.model;

import java.util.Objects;

public class Employee {
	private int employeeId;
    private	String employeeName;
	private String employeeeDepartment;
	private double employeeSalary;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param employeeid
	 * @param employeename
	 * @param employeeeDepartment
	 * @param employeeSalary
	 */
	public Employee(int employeeId, String employeeName, String employeeeDepartment, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeeDepartment = employeeeDepartment;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeid) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeeDepartment() {
		return employeeeDepartment;
	}
	public void setEmployeeeDepartment(String employeeeDepartment) {
		this.employeeeDepartment = employeeeDepartment;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeId + ", employeename=" + employeeName + ", employeeeDepartment="
				+ employeeeDepartment + ", employeeSalary=" + employeeSalary + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		if(obj==this)
			return true;
		Employee employee=(Employee)obj;
		if(this.employeeId==employeeId&&employeeName==employee.employeeName)
			return true;
		else 
			return false;
	}
		@Override
		public int hashCode() {
			return Objects.hash(employeeId,employeeName);
		}
		
		
	}

