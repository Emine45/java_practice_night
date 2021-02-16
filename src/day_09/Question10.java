package day_09;

import java.util.ArrayList;
import java.util.List;

public class Question10 {
	public static void main(String[] args) {
		/*What is the result?
		 * A. Compile time error
		 * B. Run time error
		 * C. 3 4
		 * D. 2 3
		 * E. null 3 4
		 */
		List<Integer> nums = new ArrayList<>();
		nums.add(null);//2,3
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);	
		//nums.remove(10);//exception because tehre is no index of 10
		nums.remove(1);
		nums.remove(null);//when we remove with value(not index), then it will remove the first matching value
		//If there is  no matching value, the java will ignore it.(not throwing exception)
		nums.remove(2);
		System.out.println(nums);
	}
}
