package samplepkg;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// Write a program to find largest of two numbers.
		
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter the First number:");
		int num1 = myObj.nextInt();
		System.out.println("Enter the Second number:");
		int num2=myObj.nextInt();
		System.out.println("The First number:" +num1);
		System.out.println("The Second number:" +num2);
		
		if (num1>num2)
		
		     System.out.println("The first number is Largest:" +num1);
		else
			
			System.out.println("The 2nd number is Largest:" +num2);
		
		
	

	}
}


