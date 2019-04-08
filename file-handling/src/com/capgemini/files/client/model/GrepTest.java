package com.capgemini.files.client.model;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.Grep;

public class GrepTest {
	Grep c=new Grep();
	@Test
	public void testLines() throws IOException {
		assertEquals(0,c.count1() );
	}

}
