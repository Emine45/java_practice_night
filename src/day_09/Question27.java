package day_09;

public class Question27 {
public static void main(String[] args) {
	int num1[]= {1,2,3,4};
	int num2[]=new int[1];
	num2=num1;
	
	for(int i:num2) {
		System.out.println(i);
	}	
}
}
