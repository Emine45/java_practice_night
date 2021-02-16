package day_09;

import java.util.Arrays;

public class Question14 {
	
	/*What is the result?
	 * A. Compile time error
	 * B. Run time error
	 * C. 0
	 * D. 4
	 * E. 1
	 */
	
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,1,0};
		
		int max=findMax(nums);
		
		System.out.println(max);
		
	}
	
	static int findMax(int[] n) {//return tyoe is now an integer
		
		int max = 0 ;
		
		Arrays.sort(n);
		
		return n[n.length-1];//returning an integer
	}

}