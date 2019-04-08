package basicassignment;

import java.util.Scanner;

public class Subjects {
	public static void main(String[] args) {
		int s1,s2,s3;
		System.out.println("enter 1st subject");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextInt();
		System.out.println("enter 2nd subject");
		Scanner sc1=new Scanner(System.in);
		s2=sc1.nextInt();
		System.out.println("enter 3rd subject");
		Scanner sc3=new Scanner(System.in);
		s3=sc3.nextInt();
		if(s1>60&&s2>60&&s3>60) {
			System.out.println("person passed");
		}
		else if((s1>60&&s2>60&&s3>60)||(s1>60&&s2>60&&s3<60)||(s1>60&&s2<60&&s3>60)||(s1<60&&s2>60&&s3>60)){
			System.out.println("person is promoted");
		}
		else if(s1>60||s2>60||s3>60) {
			System.out.println("person is failed");
		}
	}

}
