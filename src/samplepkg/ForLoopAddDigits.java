package samplepkg;

import java.util.Scanner;

public class ForLoopAddDigits {

	public static void main(String[] args) {
		// Write a program to add the digits of a number
		int n,sum=0,reminder;
		
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter a number to add the Digits");
		n=myObj.nextInt();
		
		for(sum=0;n>0;n=n/10)
		{
			reminder = n % 10;
			sum= sum + reminder;
			
			
		}
		System.out.println("Sum of the Digits" +sum);

	}

}
