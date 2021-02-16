package day_09;

/*What is the result?
 * A. Compile time error
 * B. Run time error
 * C. 3
 * D. 4
 * E. 5
 */
public class Question7 {
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5};
        
        int index=0;
        
        do {
            index++;//1,2,3,4
        }while (index <= nums.length-2);
        
        System.out.println(nums[index]);
    }
}

