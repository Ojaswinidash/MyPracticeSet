package samplepkg;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		// Write a program to print 10 even numbers and 10 odd numbers
		
		int n,i;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter no of Numbers in Array");
		n= myObj.nextInt();
		
		int a[]= new int[n];
		System.out.println("Enter all the elements:");
		
		for(i=0;i<n;i++)
		{
			a[i] = myObj.nextInt();
			
		}
		
		for(i=0;i<n;i++)
		{
		   if (a[i] % 2 == 0 )
			   System.out.println("This number is a Even " +a[i]);
		   else   
			   System.out.println("This number is a ODD " +a[i]);
			   
		}	   
		
		
	}

}
