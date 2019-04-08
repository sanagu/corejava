package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountWords {
	
	
	 public long sana() throws Exception {

	      // System.out.println ("Counting Words");       
	       FileReader fr = new FileReader ("C:\\sana guru prasad\\sql assignment\\sql.txt");        
	       BufferedReader br = new BufferedReader (fr);     
	       String line = br.readLine ();
	       int count = 0;
	       while (line != null) {
	          String []parts = line.split(" ");
	          for( String w : parts)
	          {
	            count++;        
	          }
	       // line = br.readLine();
	       }
		return count;         
	 }
}


