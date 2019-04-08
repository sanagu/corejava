package com.capgemini.spring.model;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component("address")
public class Address{

	@Value("Mumbai")
	private String cityName;

	@Value("Maharashtra")
	private String stateName;

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	
}