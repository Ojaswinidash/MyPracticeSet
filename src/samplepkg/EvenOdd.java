package samplepkg;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// Write a program to check given number is even or odd.
		
		int num;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num=myObj.nextInt();
		System.out.println("Number is" +num);
		
		if(num % 2 == 0 )			
			System.out.println("Number is Even" +num);
		else 
			System.out.println("Number is Odd" +num);
		
			
			

	}

}
