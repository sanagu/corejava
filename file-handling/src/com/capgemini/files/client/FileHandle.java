package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandle {
	public static void main(String[] args) throws IOException {
		
		/*
		 * File file=new File("C:\\New folder\\ReadME.md");
		 * System.out.println(file.exists()); File file1=new File("C:\\New folder");
		 * System.out.println(file.exists());
		 */
		 
		/*
		 * File file=new File("test.txt"); if(!file.exists()) { file.createNewFile();
		 * System.out.println("file is successfully"); }
		 */
		//FileWriter writer=new FileWriter(file);
		//BufferedWriter writer=new BufferedWriter(new FileWriter(file));
		/*
		 * PrintWriter writer=new PrintWriter(new FileWriter(file,true));
		 * writer.println("hello...\n");
		 * 
		 * writer.println("hello bye...\n"); writer.println("hello hii...\n");
		 * 
		 * writer.close(); System.out.println("content has been written successfully");
		 */
		/*
		 * FileReader reader=new
		 * FileReader("C:\\sana guru prasad\\sql assignment\\sql.txt"); BufferedReader
		 * reader1=new BufferedReader(reader); PrintWriter writer=new
		 * PrintWriter("dql.txt"); String content;
		 * while((content=reader1.readLine())!=null) { //System.out.println(content);
		 * writer.println(content); } System.out.println("success"); writer.close();
		 * reader1.close(); reader.close();
		 */
		/*File windowsDirectory=new File("c:\\windows");
		System.out.println(windowsDirectory.isDirectory());
		String content[]=windowsDirectory.list();
		for(String s:content) {
			System.out.println(s);*/
		File newDir=new File("myDir");
		if(!newDir.exists()) {
			newDir.mkdir();
			System.out.println("folder is created successfully");
		}
		File file=new File(newDir,"myfile.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is created successfully");
		}
		}
	}


