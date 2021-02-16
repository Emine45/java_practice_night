package day_09;

public class Question29 {
    public static double result;    
    int a=5;//this member must be static so it can compile in the static main method.Nonstatic member cannot go in the static main method
    int b=6;//this member must be static so it can compile in the static main method.Nonstatic member cannot go in the static main method
    public static void main(String[] args) {
        double c;//This must be initialized bacause this is is local variable
//        if(result==0) {
//            a=2;
//            b=3;
//            c;      
//        }   
//        result=a*b*c;
        System.out.println(result);
    }
}
