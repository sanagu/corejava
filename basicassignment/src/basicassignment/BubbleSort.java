package basicassignment;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
    	int a[],temp;
    	System.out.println("enter n value");
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	a=new int[n];
    	System.out.println("enter array values");
    	for(int i=0;i<n;i++) {
    		a[i]=sc.nextInt();
    	}
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n-i-1;j++) {
    			if(a[i]>a[i+1]) {
    				temp=a[i];
    				a[i]=a[i+1];
    				a[i+1]=temp;
    		   }
    	    }
    		
    		}
    	System.out.println("In ascending order: ");
	    for(int j=0;j<n;j++)
	    	System.out.println(a[j]);
    	}
    }
    
