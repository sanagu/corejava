package com.capgemini.inter.demo;

import com.capgemini.inter.demo.Interface.inter;
import com.capgemini.inter.demo.Interface.inter1;

public  class InterfaceDemo implements inter,inter1 {
	@Override
	public void sana() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void guru() {
		// TODO Auto-generated method stub
		System.out.println("hello......");
	}
 public  void main(String[] args) {
	InterfaceDemo d=new InterfaceDemo();
	d.sana();
	d.guru();
 }
}
