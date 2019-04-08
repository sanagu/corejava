package com.capgemini.files.client.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.files.client.CountWords;

public class CountsWordsTest {
	CountWords c=new CountWords(); 
	@Test
	public void testCountWords() throws Exception {
		assertEquals(1690, c.sana());
	}
}
