package day_09;

public class Question31 {
	public static void main(String[] args) {

		System.out.println("a");

		try {
			System.out.println("b");
			String c="abc";
			System.out.println(c.charAt(3));//error=>catch
			System.out.println("c");//this line wont execute

		}catch(NullPointerException | ArrayIndexOutOfBoundsException e){
			System.out.println("d");
			System.out.println(e.getClass());

		}catch(StringIndexOutOfBoundsException e){
			System.out.println("e");
			//System.out.println(e.getClass());

		}finally {
			System.out.println("f");//this will always run
		}
		
		System.out.println("g");	//this will run 
	}
}
