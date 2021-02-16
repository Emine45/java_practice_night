package day_09;

public class Question15 {
	/*
	 * What is the result? A. Compile time error B. Run time error 
	 * C. 0 0.0 a 
	 * D. 2 2.0 c 
	 * E. 1 1.0 b
	 */

	public static void main(String[] args) {
		Class1 obj1 = new Class1();

		obj1.printCount();
		obj1.printCount();

		System.out.print(obj1.count);
		System.out.print(" " + obj1.count1);
		System.out.print(" " + obj1.count2);
	}
}

class Class1 {
	static int count = 0;
	static double count1 = 0;
	static char count2 = 'a';

	static void printCount() {
		count++;
		count1++;
		count2++;
	}
}