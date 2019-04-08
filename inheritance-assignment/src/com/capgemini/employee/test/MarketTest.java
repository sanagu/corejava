package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Market;

class MarketTest {

	//Market m=new Market();
	@Test
	public void checkObject() {
		Market m=new Market();
		assertNotNull(m);
	}
		@Test
		public void checkParaObj() {
			Market m=new Market(1234,"sana",60000,3000,5);
			assertNotNull(m);
		}
			@Test
			public void checkGross() {
				Market m=new Market(1234,"sana",50000,2000,5);
				assertEquals(78525.0,m.getGrossSalary(),0.01);
			}
}
