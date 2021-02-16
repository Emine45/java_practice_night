package day_03;

public class StringManipulations3 {

	public static void main(String[] args) {
		
		/*    
		   Create a string : name and assign a 3 word sentences
		   if name is one or two words print “enter 3 words sentences”
		   otherwise reverse the order of the words
		   e.g: I love java ==> java love I
		*/
		
		//There are 2 spaces in 3 word sentences
		String name = "I love java";
		             //0123456
		//Finding the index of the first space.
		//This will return -1 is there is not space
		int firstSpace = name.indexOf(" "); //if this is -1, then there is no space
		//it means there is only one word
		System.out.println(firstSpace);
		
		//if there is no second space, this will return -1
		int secondSpace = name.indexOf(" ", firstSpace + 1); //
		System.out.println(secondSpace);
		
	//	int lastSpace = name.lastIndexOf(" ");
	//	System.out.println(lastSpace);
		
		String firstWord = name.substring(0, firstSpace);
		System.out.println(firstWord);
		//                                    2           ,    6 =>2345
		String secondWord = name.substring(firstSpace + 1, secondSpace);
		System.out.println(secondWord);
		//                                   7  => 7 until the end index
		String thirdWord = name.substring(secondSpace + 1);
		System.out.println(thirdWord );
		
		if(firstSpace!=-1 && secondSpace!=-1) {
			System.out.println(thirdWord + " " + secondWord + " " + firstWord);
		}else {
			System.out.println("Enter 3 word sentences");
		}
		
		//Note There is another way to reverse string sentence using Arrays

	}

}
