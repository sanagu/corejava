package com.capgemini.laptop.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Car;
import com.capgemini.client.LapTop;
import com.capgemini.client.Television;

public class TelevisionTest {
	private static Television lg;
	private static Television sony;
	private static Television samsung;
	@BeforeClass
	public static void setUp() {
		lg=new Television("lg","lcd",false,15000);
		sony=new Television("sony","led",false,25000);
		samsung=new Television("samsung","plasama",true,45000);
	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<Television> set=new HashSet<>();
		set.add(lg);
		set.add(sony);
		set.add(samsung);
		set.add(lg);
		assertEquals(3,set.size());
		
	}
	@Test
	public void testWheatherTheOrderIsMaintained() {
		ArrayList<Television> al=new ArrayList<>();
		al.add(lg);
		al.add(sony);
		al.add(samsung);
		Iterator<Television> iterator=al.iterator();
		assertEquals("lg", iterator.next().getCompany());
		assertEquals("sony", iterator.next().getCompany());
		assertEquals("samsung", iterator.next().getCompany());
	}
	
}
