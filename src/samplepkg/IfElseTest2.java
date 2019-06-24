package samplepkg;

import java.util.Scanner;

public class IfElseTest2 {

	public static void main(String[] args) {
		// Write a program to check if the number is positive or negative.
		
		        Scanner myObj = new  Scanner(System.in);  
				System.out.println("Enter the Number:");
				int num= myObj.nextInt();
				System.out.println("Number is:"+num);
		
		
			if (num>0)
				
				System.out.println("Number is Positive");
			else if (num<0)
				
				System.out.println("Number is Negative");
			else 
				System.out.println("Number is neither Negative nor postive");
				
				
	}

}
