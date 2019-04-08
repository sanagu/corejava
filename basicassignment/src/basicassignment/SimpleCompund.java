package basicassignment;

import java.util.Scanner;

public class SimpleCompund {
	public static void main(String[] args) {
		double p,t,r;
		System.out.println("enter principal");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		System.out.println("enter time");
		Scanner sc1=new Scanner(System.in);
		t=sc.nextInt();
		System.out.println("enter rate of interest");
		Scanner sc2=new Scanner(System.in);
		r=sc.nextInt();
		System.out.println("enter n value");
		
		double si=(p*t*r)/100;
		double ci=(p*Math.pow(1+r/100,t))-p;
		int ci1=(int)ci;
		System.out.println(si);
		System.out.println(ci1);
	}

}
