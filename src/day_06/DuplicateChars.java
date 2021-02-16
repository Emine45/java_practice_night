package day_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateChars {

	public static void main(String[] args) {

	    /*
	     *  Write a code that returns the duplicate chars in a String array
	     * e.g.
	     * String str=“ilovejavatoo”
	     * Output: o v a
	     */
		
		String str = "ilovejavatoo";
		List<Character> listOfUniqueChar = new ArrayList<>();  //I will add unique chars on this list
		char[] ch = str.toCharArray();
		
		
		Arrays.sort(ch);
		
		for(int i = 0; i<ch.length-1; i++) {
			if(ch[i]==ch[i+1] && !listOfUniqueChar.contains(ch[i])) {
				listOfUniqueChar.add(ch[i]);
			}
		}
		System.out.println(listOfUniqueChar);
	}

}
