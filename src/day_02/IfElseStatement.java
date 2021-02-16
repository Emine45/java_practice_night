package day_02;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		/*
		 * Create a class : “IfElseStatement” Print “Please enter your job title” create
		 * a String variable named jobTitle and get the data from the user Use the below
		 * test data to print the correct jobTitle. Example : if jobTitle is qa then
		 * print “Your job title is Qualty Analyst” 
		 * test data:
		 *  qa then print Quality Analyst 
		 *  dev then print Developer
		 *  ba then print Business Analyst
		 *  pm then print Project Manager 
		 *  investor print Stakeholder
		 */
		
		//command

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your job title");
		String jobTitle = scan.next();
		
		//
		String qa = "Quality Analyst ";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";
		String investor = "Stakeholder";

		if (jobTitle.toLowerCase().equals("qa")) {
			System.out.println("Your job title is " + qa);
			//System.out.println("Your job title is Quality Analysist" );

		} else if (jobTitle.toLowerCase().equals("dev")) {
			System.out.println("Your job title is " + dev);

		} else if (jobTitle.toLowerCase().equals("ba")) {
			
			System.out.println("Your job title is " + ba);

		} else if (jobTitle.toLowerCase().equals("pm")) {
			System.out.println("Your job title is " + pm);

		}else if(jobTitle.toLowerCase().equals("investor")){
			System.out.println("Your job title is "+ "investor");
		}else {
			System.out.println("The is not such title : "+jobTitle);
			
		}		scan.close();
	}

}
