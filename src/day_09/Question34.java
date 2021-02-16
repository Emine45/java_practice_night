package day_09;

public class Question34 {
	public static void main(String[] args) {
		String a = "java";
		String b = new String("java");
		String c = b;

		if (a.equals(c)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}