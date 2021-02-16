package day_05;

import java.util.Arrays;

public class PrintArray2 {

	public static void main(String[] args) {
		/*
		   Create a static method name: acceptString
           It should take accept 3 strings as parameter
           and print them as an array
           e.g. String[] array = { "sam", "john", "tom" }; 
           acceptString(“sam”,”john”,”tom”);
           Then output: [sam,john,tom]
           Create another static method name: acceptString2
           It should take accept 3 strings as parameter
           and print each element in the array
           e.g. String[] array = { "sam", "john", "tom" }; 
           acceptString(“sam”,”john”,”tom”);
           Then output: sam john tom
		 */
		String[] array = { "sam", "john", "tom" };
		acceptString("sam","john","tom");
		
		acceptString2("sam","john","ali");

	}
	// Then output: [sam,john,tom]
	public static void acceptString(String str1, String str2, String str3) {
		String[] array = {str1, str2, str3};
		System.out.println(Arrays.toString(array)); //this won't work for multi dimentional arrays
		System.out.println(Arrays.deepToString(array));
	}
	//Then output: sam john tom
	public static void acceptString2(String str1, String str2, String str3) {
		String[] array = new String[3];
		array[0]=str1;
		array[1]=str2;
		array[2]=str3;
		
		for(String str:array) {
			System.out.print(str + " ");
		}
		
	}

}
