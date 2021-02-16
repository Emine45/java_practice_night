package day_09;

public class Question8 {
	/*What is the result?
	 * A. Compile time error
	 * B. Run time error
	 * C.    ,false,0.0
	 * D.    ,false,0.0f
	 * E.  0,false,0.0
	 */
	static char ch;
	static boolean b;
	static float f;
	
	static void print() {
		System.out.println(ch + ","+b+","+f);
	}

	public static void main(String[] args) {
		print();		
	}
}