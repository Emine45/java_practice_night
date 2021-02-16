package day_09;

//Is there any issue? If not, What is the result?
public class Question22 {
	public static void main(String[] args) {
		int num=10;	
		num++;	//11
		if(++num < 11) {  //12
			System.out.println(--num);
		}else {
			System.out.println(++num);  //13
		}
	}
}
