package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
	public int sana() throws IOException {
	FileReader in = new FileReader("C:\\\\sana guru prasad\\\\sql assignment\\\\sql.txt");
	BufferedReader br = new BufferedReader(in);
	int n = 0;
	while (br.readLine() != null) {
	    n++;

	}
	return n;

}
}