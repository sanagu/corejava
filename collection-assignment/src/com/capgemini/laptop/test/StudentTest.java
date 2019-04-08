package com.capgemini.laptop.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.CellPhone;
import com.capgemini.client.Student;

public class StudentTest {
	private static Student guru;
	private static Student sana;
	private static Student prasad;
	@BeforeClass
	public static void setUp() {
		guru=new Student("guru","1230","kadapa");
		sana=new Student("sana","12302","anathapur");
		prasad=new Student("prasad","12304","krishna");
	}
	@Test
	public void testDuplictaes() {
		HashSet<Student> set=new HashSet<>();
		set.add(guru);
		set.add(sana);
		set.add(prasad);
		set.add(guru);
		assertEquals(3,set.size());
	}
	@Test
	public void testSorting() {
		TreeSet<Student> var=new TreeSet<>();
		var.add(guru);
		var.add(sana);
		var.add(prasad);
		
		Iterator<Student> iterator=var.iterator();
	
		assertEquals("guru",iterator.next().getName());
		assertEquals("prasad",iterator.next().getName());
		assertEquals("sana",iterator.next().getName());
	}
	@Test
	public void testMap() {
	HashMap<String, String> map=new HashMap<String,String>();
	map.put(guru.getName(),"mango");
	map.put(sana.getName(),"grape");
	map.put(prasad.getName(),"apple");
	assertEquals("mango",map.get(guru.getName()));
	assertEquals("apple",map.get(prasad.getName()));
	assertEquals("grape",map.get(sana.getName()));
	}
}
