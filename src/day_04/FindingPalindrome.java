package day_04;

public class FindingPalindrome {

	public static void main(String[] args) {
		
		
		String original = "Able was I ere I saw Elba";
		String reversed = "";
		int len = original.length(); 
		System.out.println(len);
		
		for(int i=len-1; i>=0; i--) {
			reversed+=original.charAt(i);
		}
		
		if(original.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		


	}

}
