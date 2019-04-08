package com.capgemini.client;

public class Student implements Comparable<Student> {
	private String name;
	private String roll;
	private String city;
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param roll
	 * @param city
	 */
	public Student(String name, String roll, String city) {
		super();
		this.name = name;
		this.roll = roll;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.name.compareTo(s.name);
	}
	
}
