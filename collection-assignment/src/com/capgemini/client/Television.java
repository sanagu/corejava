package com.capgemini.client;

public class Television {
	private String company;
	private String  type;
	private boolean threeD;
	private double price;
	/**
	 * 
	 */
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param company
	 * @param type
	 * @param threeD
	 * @param price
	 */
	public Television(String company, String type, boolean threeD, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeD = threeD;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isThreeD() {
		return threeD;
	}
	public void setThreeD(boolean threeD) {
		this.threeD = threeD;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
