package day_08;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		
		/*
		 * Map is key and value pairs
		 * key:first, value:second
		 * key must be unique
		 * value can repeat
		 */

		/* 1. Create a Map :
         * Map<String,Integer> salaryMap=new HashMap<> ();
         * 2. add the job title and salary pairs:
         * "doctor", 500000
         * "nurse", 70000
         * "developer", 110000
         * "president", 200000
         * "tester", 100000
         * "lawyer", 150000
         * "teacher", 50000
         * 3. print the value of a doctor's salary only
         * 4. replace the nurce's salary with 75000
         * 5. replace the developer's salary with 120000 using put method
         * 6. remove lawyer from the list
         * 7. print true if there is a key called "judge". print false otherwise
         * 8. print true if there is a value called 10000. print false otherwise
         * 
         */
		
		 //C(create) R(read) U(update) D(delete) operation with Map
        //cerating a map
        Map<String,Integer> salaryMap=new HashMap<> ();
        //add key-value pairs using put
        salaryMap.put("doctor", 500000);
        salaryMap.put("nurse", 70000);
        salaryMap.put("developer", 110000);
        salaryMap.put("president", 200000);
        salaryMap.put("tester", 100000);
        salaryMap.put("lawyer", 150000);
        salaryMap.put("teacher", 50000);
        //printing the entire map
        System.out.println(salaryMap);
        //using key, getting value
        System.out.println(salaryMap.get("doctor"));
        //updating nurse salary
        salaryMap.replace("nurse",75000);
        System.out.println(salaryMap);
        //when you to enter duplicate key, then it will update the existing value
        salaryMap.put("developer", 120000);
        System.out.println(salaryMap);
        //deleting lawyer key,value pair.
        salaryMap.remove("lawyer");
        System.out.println(salaryMap);
        //checking if map has "judge" as a key
        System.out.println(salaryMap.containsKey("judge"));
        //checking if map has 10000 as a value
        boolean isTrue=salaryMap.containsValue(10000);
        System.out.println(isTrue);
        //2.Way
        // System.out.println(salaryMap.containsValue(10000));
        
    }
}
