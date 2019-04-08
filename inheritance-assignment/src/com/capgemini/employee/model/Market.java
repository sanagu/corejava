package com.capgemini.employee.model;

public class Market extends Employee{
	private double kilo;
	private double tourAllowance;
	private double teleAllowance=1500;


	public Market() {
		// TODO Auto-generated constructor stub
	}

 
	/**
	 * @param kilo
	 * @param tourAllowance
	 * @param teleAllowance
	 */
	public Market(int employeeId, String employeeName, double basicSalary, double medical,double kilo) {
		super( employeeId,  employeeName, basicSalary,  medical);
		this.kilo = kilo;
		
	}
	@Override
	public double getGrossSalary() {
		tourAllowance=5*kilo;
		return (super.getGrossSalary()+tourAllowance+teleAllowance);
	}
	
}
