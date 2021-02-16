package day_09;

/*What is the result?
 * A. Compile time error
 * B. Run time error
 * C. true
 * D. false
 */
public class Question5 {
    public static void main(String[] args) {
        String str1 = "string1";
        String[] str2 = { "s", "t", "r", "i", "n", "g", "1" };
        String str3 = "";           //(str3 ye deger atamamisti soruda deger atamazsan CTE)
        for (String str : str2) {
            str3 += str;
        }
        
        System.out.println(str1.equals(str3));
    }
}
