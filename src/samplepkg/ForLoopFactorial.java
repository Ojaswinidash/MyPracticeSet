package samplepkg;

import java.util.Scanner;

public class ForLoopFactorial {

	public static void main(String[] args) {
		// Write a program to find factorial of a number.
		int num,i,fact=1;
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the number");
		num=myObj.nextInt();
		System.out.println("The Number is:"+num);
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("The Factorial of this number is:"+fact);
	}

}
