package day_09;

//Is there any issue? If not, What is the result?
public class Question24 {
	public static void main(String[] args) {
		Test obj1=new Test();
//		obj1.method1(); //(comment'i kaldirinca error veriyor)
		obj1.method2();
	}
}

class Test {
	 private void method1() { //Encapsulation= hiding data, this method will not be accessed in other classes
		System.out.println("Method 1");
	}
	
	void method2() {
		method1();
		System.out.println("Mehrod 2");
	}
}
