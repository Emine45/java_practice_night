package day_04;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 Use print the reverse of your name
		 
		 e.g john=>nhoj
		  */
		
		String str = "emine batar";
		//            0234567891011
		//             len=11
		String reversed = "";
		int len = str.length();  //len=11
		//What is the index of last letter=10
		System.out.println(len);
		
		for(int i=len-1; i>=0; i--) {
			reversed+=str.charAt(i);
		}
		System.out.println(reversed);

	}

}
