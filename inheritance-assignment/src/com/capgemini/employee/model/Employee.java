package com.capgemini.employee.model;

public class Employee {
		private int employeeId;
		private String employeeName;
		private double basicSalary;
		private double medical;
		private double goss;
		private double medical1;
		private double medical2;
		/**
		 * 
		 */
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		/**
		 * @param employeeId
		 * @param employeeName
		 * @param basicSalary
		 * @param medical
		 */
		public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.basicSalary = basicSalary;
			this.medical = medical;
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public double getBasicSalary() {
			return basicSalary;
		}
		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}
		public double getMedical() {
			return medical;
		}
		public void setMedical(double medical) {
			this.medical = medical;
		}

		public double getHra() {
			return getBasicSalary()/2;
		}
		public void setHra(double medical2) {
			this.medical2 = medical2;
		}
		public void setGossSalary(double medical1) {
			this.medical1 = medical1;
		}
		public double getGrossSalary() {
			double hra=(50*getBasicSalary())/100;
			
			return getBasicSalary()+hra+getMedical();
		}
		public void setNetSalary(double goss) {
			this.goss= goss;
		}
		public double getNetSalary () {
			return getGrossSalary()-(getBasicSalary()*0.12+200);
			
		}
		
		
}




