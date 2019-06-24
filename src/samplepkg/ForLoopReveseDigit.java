package samplepkg;

import java.util.Scanner;

public class ForLoopReveseDigit {

	public static void main(String[] args) {
		//Write a program to reverse the digits of a number
		
		int n,rev=0;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number to Reverse the Digits:");
		n=myObj.nextInt();
		
		
		System.out.println("The Number Before Reverse the Digits:" +n);
		
		   for( ;n != 0; )
		   {
			   rev=rev*10;
			   rev=rev+n % 10;
			   n=n/10;
			   			   
		   }
		   
		   System.out.println("The Number after Reverse the Digits:" +rev);
		
	
		

	}

}
