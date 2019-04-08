package com.capgemini.files.client.model;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.CountLines;

public class ContLineTest {
	CountLines c=new CountLines();

	/*
	 * @Test public void testIsEmpty() throws IOException {
	 * assertEquals("not empty",c.sana()); }
	 */
	@Test
	public void testCountLines() throws IOException {
		assertEquals(157, c.sana());
	
	}
}
