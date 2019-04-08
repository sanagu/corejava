package basicassignment;
import java.util.Scanner;
public class SearchingArray {
 public static void main(String[] args) {
	 int a[],flag=0;
	 System.out.println("enter n value");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 a=new int[n];
	 System.out.println("enter array values");
	 for(int i=0;i<n;i++)
	 {
		
		 a[i]=sc.nextInt();
	 }
	 for(int i=0;i<n;i++) {
		 if(a[i]==19)
		 {
			 
			 flag=1;
			 break;
		 }
	 
	
	 }
	
	 if(flag == 1)
		 System.out.println("found");
	 else
		 System.out.println("not found");
 }
}
