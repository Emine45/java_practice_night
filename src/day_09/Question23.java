package day_09;

public class Question23 {
	private char ch;

	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = ch1;
		ch2 = 'b';
		
		Question23 obj=new Question23();
		obj.ch='c';
		
		System.out.println(obj.ch+" , "+ch1+" , "+ch2);
	}
}