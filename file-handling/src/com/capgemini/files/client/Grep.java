package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Grep {
	
	public int count1() throws IOException {
	   FileReader fr = new FileReader ("C:\\sana guru prasad\\sql assignment\\sql.txt");        
       BufferedReader br = new BufferedReader (fr); 
       String line ;
      String s="month";
      int count=0;

      while (( line = br.readLine()) != null)
      {
          count++;
          int indexfound = line.indexOf(s);

          if (indexfound > -1) 
          {
              System.out.println("Word is at position " + indexfound + " on line " + count);
              System.out.println(line);
          }
      }
      br.close();
      return 0;
	}
     
  }
	


	
