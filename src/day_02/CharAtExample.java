package day_02;

public class CharAtExample {

	public static void main(String[] args) {
		//Create a class : “CharAtExample”
		//Create the “pickName” string and assign the alphabet.
		//String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//Then create 4 char variables ch1, ch2, ch3, ch4 Assign the letters using charAt method
		//Then print J A V A on the console using the chars
		
		//understand question
		//
		
		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//                 0123456789
		char ch1 = pickName.charAt(9);
		char ch2 = pickName.charAt(0);		
		char ch3 = pickName.charAt(21);
		char ch4 = pickName.charAt(0);   // or char ch4 = ch2;
		System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4);  // or
		//System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch2); // if you don't create ch4
		
		//printing without space
		System.out.println(""+ch1+ch2+ch3+ch4);
	}

}
