package day_03;

import java.util.Scanner;

public class StringManipulations1 {

	public static void main(String[] args) {
		
		/*
		 * ask user to enter an e-mail address then 
		 * if it contains "hotmail" replace it with "gmail" 
           e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com
		 */
		
		Scanner scan = new Scanner(System.in);
		//giving message to user
		System.out.println("Enter your hotmail");
        //asking user to enter the string
		String hotmail = scan.nextLine();
       //checking user entered a hotmail address and replacing hotmail => gmail
		if (hotmail.contains("@hotmail.com")) {
			String gmail = hotmail.replace("hot", "g");
			System.out.println("New email : " + gmail);
		} else {
			System.out.println("You entered an incorrect hotmail address");
		}
		scan.close();
	}

}
