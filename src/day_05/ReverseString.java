package day_05;

public class ReverseString {
//  Create a String method: reverseString
//  It should accept a string sentences
//  And return the reverse of that string sentences.
//  E.g:
//  String str ="I love Java"; 
//  Output:"Java love I”
    public static void main(String[] args) {
        System.out.println(reverseString("I love Java"));
    }
    public static String reverseString(String sentence) {
        String[] splitted = sentence.split(" ");// [I,love,Java]
                                                // 0 1 2
        String reversed = "";
        for (int i = splitted.length - 1; i >= 0; i--) {
            reversed += splitted[i] + " ";
        }
        return reversed;
    }
}
