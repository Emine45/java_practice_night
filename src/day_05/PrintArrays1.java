package day_05;

import java.util.Arrays;

public class PrintArrays1 {

	public static void main(String[] args) {
		/*
		   Create a static method: acceptArray
           It should take one String array as parameter 
           and print them as an array
           e.g String[] array = { "sam", "john", "tom" };
           acceptArray(array);
           Then output: [sam,john,tom]
           Create another static method :acceptArray2
           It should take one String array as parameter 
           and print each element in the array
           e.g String[] array = { "sam", "john", "tom" };
           acceptArray2(array);
           Then output: sam john tom
		 */
		
		String[] array = {"sam", "john", "tom"};
		
		//We must create class abject to call non-static methods:
		PrintArrays1 obj = new PrintArrays1();
		obj.acceptArray(array);
		//acceptArray(array)
		
		accepArray2(array);
	}
	
		public void acceptArray(String[] name) {
			System.out.println(Arrays.toString(name));
		
	}
		
		public static void accepArray2(String[] name) {
			for(String each:name) {
				System.out.print(each + " ");
			}
		}

}
