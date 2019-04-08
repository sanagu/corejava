package basicassignment;
import java.util.Scanner;
public class SumAvg {
  public static void main(String[] args) {
	  int s2,v=0,p=0;
	 System.out.println("enter m,n values");
	  Scanner sc=new Scanner(System.in);
	  int m=sc.nextInt();
	  int n=sc.nextInt();
	  int s1[][]=new int[m][n];
	  System.out.println("enter array values");
	  for(int i=0;i<m;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  s1[i][j]=sc.nextInt();
		  }
	  }
	  for(int i=0;i<m;i++) {
		  for(int j=0;j<n;j++) {
			  
		  
	  
	   v=v+s1[i][j];
	  
	   
  }
		  
		  System.out.println(v);
		  v=0;
		 
}
	  for(int i=0;i<n;i++) {
		  int j=0;
		   p=p+s1[i][j];
	  }
	  System.out.println(p);
}
}
