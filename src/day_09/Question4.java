package day_09;

/*What is the result?
 * A. Compile time error
 * B. Run time error
 * C. Count : 2
 * D. Count : 3
 * E. Count : 4
 */
public class Question4 {
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5,2};
        int num=2;
        int count=0;
        for(int i:nums) {
            if(i!=num) {
            	count++;
                continue;
               // count++; //(bunun yukarida continue'dan once yazilmasi lazim)
            }
        }
        
        System.out.println("Count : "+count);
    }
}