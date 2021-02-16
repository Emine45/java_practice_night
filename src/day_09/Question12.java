package day_09;

public class Question12 {	
	/*What is the result?
	 * A. Compile time error
	 * B. Run time error
	 * C. 1 3 5
	 * D. 0 2 4
	 * E. 1 1 1
	 */
	static int count=0;
	
	static void displayMsg() {
		count++;  //1
		System.out.println("Count : "+count++); //count++, printing first, then increasing by 1
		//count=2,4,6
	}
	
	public static void main(String[] args) {
		Question12.displayMsg();
		Question12.displayMsg();
		Question12.displayMsg();	
	}
}
