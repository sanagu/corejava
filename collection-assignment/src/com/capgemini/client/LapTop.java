package com.capgemini.client;

import java.util.Objects;

public class LapTop {
	 private String company;
	 private String model;
	 private String os;
	 private String processor;
	/**
	 * @param company
	 * @param model
	 * @param os
	 * @param processor
	 */
	 
	public LapTop() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public LapTop(String company, String model, String os, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.os = os;
		this.processor = processor;
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

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	
	 
	@Override
	public int hashCode() {
		
		return Objects.hash(company,model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof LapTop) {
			return false;
		}
		
		
		LapTop laptop = (LapTop) obj;
		if(this.company==laptop.company && this.model==laptop.model) {
			return true;
		}
	
		return false;
	}

}
