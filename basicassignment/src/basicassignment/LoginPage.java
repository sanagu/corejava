package basicassignment;

import java.util.Scanner;

public class LoginPage {
	public static void main(String[] args) {
		int flag=0;
	
		String username = "guru";
		String pass="sana";
		for(int i=1;i<=3;i++) {
		System.out.println("enter username");
		Scanner sc=new Scanner(System.in);
		String un=sc.nextLine();
		System.out.println("enter password");
		Scanner sc1=new Scanner(System.in);
		String ps=sc1.nextLine();
		if(un.equals(username) && ps.equals(pass)) {
			flag=1;
			break;
		}
	}
		if(flag==1)
			System.out.println("welcome");
		else
			System.out.println("contact admin");			

}
}