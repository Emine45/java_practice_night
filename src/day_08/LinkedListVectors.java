package day_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LinkedListVectors {

	public static void main(String[] args) {

		/*
		 * What is the different between arrayList and linkedList?
		 * arrayList is better when we staring and access the date using index
		 * arrayList is faster accessing the data using the index
		 * linkedList is better when we manipulate the data add or remove the data
		 * linkedList can be used Queue and have more methods.
		 */
		
		
		 /* 1. Create a class: LinkedListVectors
         * Create an arrayList of string: arrayList
         * and add the names: john, sam, tom, matt
         * Remove the second value in the list
         * Change the first value-john- with juan
         * 
         *2.  Create a linkedlist of string:linkedList 
         * add the names: zoe, marry, sue, elon
         * remove the names is there if the name contains 'n' in it
         * 
         * 
         * 3. Create a Vector of list :vec
         * And add the strings: apple, orange, banana, lettuce
         * and remove banana from the vector
		 */
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("john");
		arrayList.add("sam");
		arrayList.add("tom");
		arrayList.add("matt");
		System.out.println(arrayList);  //[john, sam, tom, matt]
		
		//Removing using remove method
		arrayList.remove(1);
		System.out.println(arrayList);  //[john, tom, matt]
		
		//Removing using remove String
//		arrayList.remove("john");
//		System.out.println(arrayList);  //[tom, matt]
		
		//Replacing data in the 0 index with juan
		arrayList.set(0, "juan");
		System.out.println(arrayList);  //[juan, tom, matt]
		
		/*
		 * 2.  Create a linkedlist of string:linkedList 
         * add the names: zoe, marry, sue, elon
         * remove the names is there if the name contains 'n' in it
		 */
		List<String> linkedList = new ArrayList<>();
		linkedList.add("zoe");
		linkedList.add("marry");
		linkedList.add("sue");
		linkedList.add("elon");
		System.out.println(linkedList);  //[zoe, marry, sue, elon]
		for(int i = 0; i<linkedList.size(); i++) {
			if(linkedList.get(i).contains("n")) {
				linkedList.remove(i);
			}
		}
		System.out.println(linkedList);  //[zoe, marry, sue]
		
		/*
		 *  3. Create a Vector of list :vec
         * And add the strings: apple, orange, banana, lettuce
         * and remove banana from the vector
		 */
		  
		Vector<String> vec = new Vector<>();
		vec.add("apple");
		vec.add("orange");
		vec.add("banana");
		vec.add("lettuce");
		System.out.println(vec);  //[apple, orange, banana, lettuce]
		
		vec.remove("banana");
		System.out.println(vec);  //[apple, orange, lettuce]
		/*
		 * Vector are similar to arrayList
		 * The only different is arrayList not synchronized
		 * Vectors are synchronized
		 */
		
	}

}
