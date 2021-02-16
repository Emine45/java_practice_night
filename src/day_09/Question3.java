package day_09;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*What is the result?
 * A. Compile time error
 * B. Run time error
 * C. 8-15-2020 5:07:04
 * D. 8-15-2020
 * E. 2020-08-15
 */
public class Question3 {
    public static void main(String[] args) {
    	
        LocalDateTime date1 = LocalDateTime.of(8,15,2020,5,7,4);  //(2020,8,15,5,7,4 olmasi lazim )
        System.out.println(date1.format(DateTimeFormatter.ISO_DATE));
        
    }
}
