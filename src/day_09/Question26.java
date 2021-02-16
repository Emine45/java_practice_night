package day_09;

public class Question26 {

	int num;
	String str;
	
	public Question26(int num,String str) {
		this.num=num;
		this.str=str;
	}
	
	public static void main(String[] args) {
		Question26 obj1=new Question26(10,"name");
		Question26 obj2=obj1;//no new keyword
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.num==obj2.num);
		System.out.println(obj1.str.equals(obj2.str));
	}
}
