package com.capgemini.client;

import java.util.Objects;

public class CellPhone<CellPhone>{
	private String company;
	private String model;
	private String description;
	private String os;
	private double price;
	/**
	 * 
	 */
	public CellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param company
	 * @param model
	 * @param description
	 * @param os
	 * @param price
	 */
	public CellPhone(String company, String model, String description, String os, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.os = os;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/*
	 * @Override public int hashCode() {
	 * 
	 * return Objects.hash(company,model); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if(obj instanceof CellPhone) { return false; }
	 * 
	 * 
	 * CellPhone cell = (CellPhone) obj; if(this.company==cell.company &&
	 * this.model==cell.model) { return true; }
	 * 
	 * return false; }
	 */
}
//company, model, description, operatingSstem, price