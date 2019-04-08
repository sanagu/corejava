package com.capgemini.mydate.model;

import com.capgemini.mydate.exception.InvalidDayException;
import com.capgemini.mydate.model.invalid.InvalidMonthException;

public class MyDate {
	int day;
	int month;
	int year;
	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param date
	 * @param month
	 * @param year
	 */
	public MyDate(int date, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int Date() throws InvalidDayException, InvalidMonthException
	
	{
		if(this.month==2) {
			
			if((this.year)%400==0&&!(((this.year)%100)==0)&&(this.year)%4==0) {
				if(this.day>=1&&this.day<=29) {
					return this.day;
				}
				else
					throw new InvalidDayException();
			}
		}
			if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12) {
			if(this.day>=1&&this.day<=31) {
				return this.day;
			}
			else
				throw new InvalidDayException();
			}
			if(this.month==4||this.month==6||this.month==9||this.month==11) {
				if(this.day>=1&&this.day<=30) {
					return this.day;
				}
				else
					throw new InvalidDayException();
				}
			if(this.month>=1&&this.month<=12) {
				return this.month;
			}
			else
				
					throw new InvalidMonthException();
				
			}
	}

