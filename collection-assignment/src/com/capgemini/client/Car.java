package com.capgemini.client;

public class Car implements Comparable<Car>{

	private String make;
	private int year;
	private int petrol;
	private String model;
	/**
	 * 
	 */
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param make
	 * @param year
	 * @param petrol
	 * @param model
	 */
	public Car(String make, int year, int petrol, String model) {
		super();
		this.make = make;
		this.year = year;
		this.petrol = petrol;
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPetrol() {
		return petrol;
	}
	public void setPetrol(int petrol) {
		this.petrol = petrol;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int compareTo(Car c) {
		// TODO Auto-generated method stub
		
		return this.make.compareTo(c.make);
	}
	
}
