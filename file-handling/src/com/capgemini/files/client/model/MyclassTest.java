package com.capgemini.files.client.model;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.files.client.MyClass;
import com.capgemini.files.client.MyClassSerialization;
import com.capgemini.files.client.client.DeserializationEmployee;
import com.capgemini.files.client.client.DeserializationMyClass;

public class MyclassTest {
	DeserializationMyClass s=new DeserializationMyClass();
	MyClassSerialization ser=new MyClassSerialization();
	ArrayList<MyClass> set;
	
	 MyClass e1;
	 MyClass e2;
	 MyClass e3;
	 MyClass e4;
	 MyClass e5;
	@Before
	public void setUp() {
		e1=new MyClass(1,"social");
		e2=new MyClass(2,"ethics");
		e3=new MyClass(3,"physics");
		e4=new MyClass(4,"maths");
		e5=new MyClass(5,"english");
		
	 set=new ArrayList<>();
	set.add(e1);
	set.add(e2);
	set.add(e3);
	set.add(e4);
	set.add(e5);
	
}
	@Test
	public void doSerialization() throws IOException {
		assertEquals(true, ser.testSerilizable("guru.ser",set));
	}
	@Test
	public void doDeserialzation() throws ClassNotFoundException, IOException {
		ArrayList<MyClass> v=(ArrayList<MyClass>) s.doDesrialization("guru.ser");
		java.util.Iterator<MyClass> a=v.iterator();
		assertEquals(e1,a.next());
		assertEquals(e2,a.next());
		assertEquals(e3,a.next());
		assertEquals(e4,a.next());
		assertEquals(e5,a.next());
	}
}