package com.capgemini.files.client;

import java.io.Serializable;

public class Employee implements Serializable {
	private long employeeid;
	private String employeeName;
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
	 * @param employeeName
	 * @param employeeSalary
	 */
	public Employee(long employeeid, String employeeName, double employeeSalary) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(employeeSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (employeeid ^ (employeeid >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(employeeSalary) != Double.doubleToLongBits(other.employeeSalary))
			return false;
		if (employeeid != other.employeeid)
			return false;
		return true;
	}
	
	
	
}
