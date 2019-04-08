package com.capgemini.files.client.model;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class FileExistTest {
	File f = new File("C:\\\\New folder\\\\ReadME.md");

	@Test
	public void testExist() {
		assertTrue(f.exists());
	}
}
