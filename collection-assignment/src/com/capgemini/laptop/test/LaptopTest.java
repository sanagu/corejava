package com.capgemini.laptop.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;


import org.junit.Test;

import com.capgemini.client.LapTop;

public class LaptopTest {
	private static LapTop hp;
	private static  LapTop dell;
	private static LapTop acer;
	@BeforeClass
	public static void setUp() {
		hp=new LapTop("hp","utt-18","windows-8","i3-core");
		dell=new LapTop("dell","utt-19","windows-10","i4-core");
		acer=new LapTop("acer","utt-20","windows-7","i7-core");

	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<LapTop> set=new HashSet<>();
		set.add(hp);
		set.add(dell);
		set.add(acer);
		assertEquals(3,set.size());
		
	}
	
	@Test
	public void testWheatherTheOrderIsMaintained() {
		ArrayList<LapTop> al=new ArrayList<>();
		al.add(hp);
		al.add(dell);
		al.add(acer);
		Iterator<LapTop> iterator=al.iterator();
		assertEquals("hp", iterator.next().getCompany());
	}
}
