package com.capgemini.employee.model;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public Manager() {
	}

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
	super(employeeId, employeeName, basicSalary, medical);

	petrolAllowance = (super.getBasicSalary()*8)/100;
	foodAllowance = (super.getBasicSalary()*13)/100;
	otherAllowance =(super.getBasicSalary()*3)/100;
	}
	
	

	
	@Override
   public double getGrossSalary() {
	   return (super.getGrossSalary() +petrolAllowance+foodAllowance+otherAllowance);
   }
   public double netSalary() {
	 return super.getNetSalary();
	//	return getGrossSalary()-(getBasicSalary()*0.12+200);

   }
}
