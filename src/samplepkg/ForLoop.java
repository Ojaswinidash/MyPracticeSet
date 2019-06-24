package samplepkg;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// Write a program to generate tables of 10
		
		int a[],b[],n,i,res=1;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number to generate tables:");
		n=myObj.nextInt();
		
		System.out.println("Tables of " +n);	
		for(i=1;i<=10;i++)
		{
			res=10*i;
		   	
		       System.out.println(n+" * " +i+ " = " +res);
		
		
		}

	}

}
