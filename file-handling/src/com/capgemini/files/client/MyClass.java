package com.capgemini.files.client;

import java.io.Serializable;

public class MyClass implements Serializable {
	private int classRoomNumber;
	private String classSubjects;
	/**
	 * 
	 */
	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param classRoomNumber
	 * @param classSubjects
	 */
	public MyClass(int classRoomNumber, String classSubjects) {
		super();
		this.classRoomNumber = classRoomNumber;
		this.classSubjects = classSubjects;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classRoomNumber;
		result = prime * result + ((classSubjects == null) ? 0 : classSubjects.hashCode());
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
		MyClass other = (MyClass) obj;
		if (classRoomNumber != other.classRoomNumber)
			return false;
		if (classSubjects == null) {
			if (other.classSubjects != null)
				return false;
		} else if (!classSubjects.equals(other.classSubjects))
			return false;
		return true;
	}
	public int getClassRoomNumber() {
		return classRoomNumber;
	}
	public void setClassRoomNumber(int classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}
	public String getClassSubjects() {
		return classSubjects;
	}
	public void setClassSubjects(String classSubjects) {
		this.classSubjects = classSubjects;
	}
	@Override
	public String toString() {
		return "MyClass [classRoomNumber=" + classRoomNumber + ", classSubjects=" + classSubjects + "]";
	}
	

}
