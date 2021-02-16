package day_02;

import java.util.Scanner;

public class IfElseStatement2 {

	public static void main(String[] args) {
     // Create a class : “IfElseStatement2”
     // Print “Please enter your operation and 2 number”
     // Get one operation name from user
     // Print “Please enter 2 numbers”
     //	Get 2 double numbers form users
     //	Example
     //	if Addition, 7, 4 then print here is the sum of your operation 7 + 4 = 11
     //	Test data:
     //	Addition 
     //	Subtraction
     //	Division 
     //	Multiplication

		Scanner scan = new Scanner(System.in);
		//
		System.out.println("Please enter your operation");
		//
		//
		String operation = scan.next();
		
		System.out.println("Enter num 1");
		double num1 = scan.nextDouble();
		System.out.println("Enter num 2");
		double num2 = scan.nextDouble();
		
		if(operation.equalsIgnoreCase("Addition")) {
			//
			System.out.println("here is the sum of your " + num1 + " + " + num2 + " = " + (num1 + num2));
			
		}else if(operation.equalsIgnoreCase("Subtraction")) {
			System.out.println("here is the difference of your operation" + " " + num1 + " - " + num2 + " = " + (num1 - num2));
			
		}else if(operation.equalsIgnoreCase("Division")) {
			System.out.println("here is the quotient of your operation" + " " + num1 + " / " + num2 + " = " + (num1 / num2));
			
		}else if(operation.toLowerCase().equals("Multiplication")) {
			System.out.println("here is the multiplication of your operation " + " " + num1 + " * " + num2 + " = " + (num1 * num2));
			
		}else {
			System.out.println(operation+" is not a valid operation. Please check your input.");
		}
		System.out.println("We are out of the if statement");
		
		scan.close();

	}

}
