package day_09;

/*What is the result?
 * A. Compile time error
 * B. Run time error
 * C. -1
 * D. 1
 */
public class Question6 {
    public static void main(String[] args) {
        
        String str="i love java";
        
        str.trim();
        
        System.out.println(str.indexOf(" "));
    }
}