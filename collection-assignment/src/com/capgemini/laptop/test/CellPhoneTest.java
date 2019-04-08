package com.capgemini.laptop.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Car;
import com.capgemini.client.CellPhone;
import com.capgemini.client.Television;

public class CellPhoneTest{
	private static CellPhone redmi;
	private static CellPhone mortola;
	private static CellPhone lg;
	@BeforeClass
	public static void setUp() {
		redmi=new CellPhone("redmi","6a","desc","andriod",13452);
		mortola=new CellPhone("mortola","a100","descq","andriod",31452);
		lg=new CellPhone("lg","s244","descew","andriod",23452);
	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<CellPhone> set=new HashSet<>();
		set.add(redmi);
		set.add(mortola);
		set.add(lg);
		set.add(lg);
		assertEquals(3,set.size());
		
	}
	@Test
	public void testWheatherSortedOrNot() {
		TreeSet<CellPhone> set1=new TreeSet<>();
		set1.add(redmi);
		set1.add(mortola);
		set1.add(lg);
		
		Iterator<CellPhone> iterator=set1.iterator();
	
		assertEquals("lg",iterator.next().getCompany());
		assertEquals("mortola",iterator.next().getCompany());
		assertEquals("redmi",iterator.next().getCompany());
		
	}
}
