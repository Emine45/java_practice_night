package day_09;

/*What is the result?
 * A. Compile time error
 * B. Run time error
 * C. Fizz
* D. Buzz
 */
public class Question2 {
	
public static String name = "java";

public static void main(String[] args) {
	
    String str = "java";
    
    if (checkEqual(str)) {
        System.out.println("Fizz");
    } else {
        System.out.println("Buzz");
    }
}

public static boolean checkEqual(String x) {
    return (x == (name)) ? true : false;
    
  }
}
