package day_05;

import java.util.Arrays;

public class SortStringsArray {

	public static void main(String[] args) {

		/*
          Create a string array : monthOfYear and add the months
          Use main method
          
          Task1: Soft the whole list and print them all in alphabetical order-CASE SENSITIVE
          E.g
          String[] monthOfYear = { "Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "aug", "Sep", "Oct", "Nov", "Dec" }; 
          Output: Apr Dec Feb Jan Jul Jun Mar Nov Oct Sep aug may
          
          Task2: Soft the whole list ignoring case and print them all- CASE INSENSITIVE
          Output: Apr aug Dec Feb Jan Jul Jun Mar may Nov Oct Sep 

		 */
		
		String[] monthOfYear = { "Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "aug", "Sep", "Oct", "Nov", "Dec" }; 
		System.out.println("alphabetical order-CASE SENSITIVE");
		Arrays.sort(monthOfYear);
		
		for(String month:monthOfYear) {
			System.out.print(month + " ");
		}
		System.out.println();
		System.out.println(Arrays.deepToString(monthOfYear));
		
		
		System.out.println("alphabetical order-CASE INSENSITIVE");
		
		Arrays.sort(monthOfYear,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.deepToString(monthOfYear));
		
	}

}
