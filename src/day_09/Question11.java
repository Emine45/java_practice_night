package day_09;

public class Question11 {
	/*What is the result?
	 * A. Compile time error
	 * B. Run time error
	 * C. 10 10
	 * D. 10 30
	 * E. 30 30
	 */
	
	int i =0;
	static int j=0;
	
	void method1() {
		while (i<10) {
			i++;
			j++;
		}
	}
	
	public static void main(String[] args) {		
		Question11 object1=new Question11();
		Question11 object2=new Question11();
		Question11 object3=new Question11();
		
		object1.method1();
//i=10,j=10
		object2.method1();
//i=10,j=20
		object3.method1();
//i=10,j=30
		
		System.out.println(object1.i);
		System.out.println(object1.j);		
	}
}
