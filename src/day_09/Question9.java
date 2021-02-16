package day_09;

public class Question9 {
	/*What is the result?
	 * A. Compile time error
	 * B. Run time error
	 * C. 1 2 3 4
	 * D. 0 0 3 4
	 * E. null null 3 4
	 */
	public static void main(String[] args) {
		int nums[];
		
		nums=new int[2];
		
		nums[0]=1;
		nums[1]=2;
		
		nums=new int[4];
		nums[2]=3;
		nums[3]=4;
		
		for(int i:nums) {
			System.out.print(i+" ");
		}
	}
}
