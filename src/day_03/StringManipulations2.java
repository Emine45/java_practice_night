package day_03;

public class StringManipulations2 {

	public static void main(String[] args) {
		/*
		 * ask user to enter 2 words : name1 and name2
           if the name1 has even numbers of characters, 
           then insert the second word in the middle of the first name 
           if the first word has odd numbers
           Then print the “Name2 cannot be inserted in the name2”
	   	    e.g: 
		    name1= mehmet
		    name2= ahmet 
            Print ==>  mehahmetmet
		 */
		
		String name1 = "mehmet";
		String name2 = "ahmet";
		//if the name1 has even number of characters,
		boolean isTrue = name1.length()%2==0;
		
		//name1.length()/2
		String firstHalf = name1.substring(0,name1.length()/2);
		String secondHalf = name1.substring(name1.length()/2);  //this will return from the middle to the end
		
		if(isTrue) {
			System.out.println(firstHalf + name2 + secondHalf);
			//System.out.println(firstHalf.concat(name2).concat(secondHalf)); //same
		}else {
			System.out.println("Names cannot be inserted in the name1");
		}
		
        

	}

}
