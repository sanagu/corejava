package com.capgemini.laptop.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Car;
import com.capgemini.client.LapTop;

public class CarTest {
	private static Car bmw;
	private static Car benz;
	private static Car honda;

	@BeforeClass
	public static void setUp() {
		bmw = new Car("bmw", 1990, 100000, "ix-360");
		benz = new Car("benz", 1992, 200000, "x-dus");
		honda= new Car("honda", 1995, 300000, "dus-x");
	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<Car> set=new HashSet<>();
		set.add(bmw);
		set.add(benz);
		set.add(honda);
		set.add(honda);
		assertEquals(3,set.size());
		
	}
	/*
	 * @Test public void testElemntsAddedOrNot() { ArrayList<Car> al = new
	 * ArrayList<>(); al.add(bmw); al.add(benz); al.add(honda); Iterator<Car>
	 * iterator = al.iterator(); assertEquals("bmw", iterator.next().getMake()); }
	 * 
	 * @Test public void testSorting() { Treeset }
	 */
	@Test
	public void testWheatherSortedOrNot() {
		TreeSet<Car> set1=new TreeSet<Car>();
		set1.add(bmw);
		set1.add(benz);
		set1.add(honda);
		
		Iterator<Car> iterator=set1.iterator();
	
		assertEquals("benz",iterator.next().getMake());
		assertEquals("bmw",iterator.next().getMake());
		assertEquals("honda",iterator.next().getMake());
		
	}
}
