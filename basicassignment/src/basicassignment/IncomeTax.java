package basicassignment;

import java.util.Scanner;

public class IncomeTax {
	public  void main(String[] args) {
		
		double s1;
		System.out.println("enter 1st subject");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextDouble();
		
		
		if(s1>0 && s1<180000) {
			System.out.println("Nil");
		}
		else if(s1>181000 && s1<300000) {
			s1=s1+s1*0.01;
			System.out.println(s1);
			}
		else if(s1>300001 && s1>500000) {
			s1=s1+s1*0.02;
			System.out.println(s1);
		}
		else if(s1>500001 && s1>1000000) {
			s1=s1+s1*0.03;
			System.out.println(s1);
		}
		else {
			System.out.println("Wrongly enterd");
		}
	}

}
