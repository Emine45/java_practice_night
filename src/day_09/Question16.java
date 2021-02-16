package day_09;

public class Question16 {
	
	//Is there any issue? If not, What is the result?
	void method1() {
		System.out.println("This is class Question16");
	}

	public static void main(String[] args) {
		Question16 object1 = new Question16();
		Question16 object2 = new B();
		Question16 object3 = new C();
		B object4 = new C();

		object1.method1();
		object2.method1();
		object3.method1();
		object4.method1();
	}
}

class B extends Question16 {
	void method1() {
		System.out.println("This is class B");
	}
}

class C extends B {
	void method1() {
		System.out.println("This is class C");
	}
}