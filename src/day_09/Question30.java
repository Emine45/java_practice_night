package day_09;

public class Question30 {
    
    public static void main(String[] args) {
        int num1=1;
        System.out.println(num1);
        System.out.println(method1(num1));//compile because method1 takes an integer parameter  
    }
    
    static int method1(int num1) {
        num1++;
        return num1;
    }
}
