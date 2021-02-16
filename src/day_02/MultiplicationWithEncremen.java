package day_02;


public class MultiplicationWithEncremen {

	public static void main(String[] args) {
		/*
		 Create a class : “MultiplicationWithEncrement”
         Ask user to enter 2 integer: num1 and num2
         Then assign two values : num1=1, num2=1
         Then print the multiplication table using ‘increment’ 
         Note: when you use ++ increment sign then it inreases by 1
         Print The Following multiplication table:
         ========= 
         1 X 1 = 1 
         1 X 2 = 2 
         1 X 3 =3 
         1 X 4 = 4 
         1 X 5 = 5 
         1 X 6 = 6 
         1 X 7 = 7 
         1 X 8 = 8 
         1 X 9 = 9 
         1 X 10 =10
         =========
		 */
		
		int num1=1;
		int num2=1;
//		System.out.println(num2);//1
//		System.out.println(num2++);//1 ==>>> Post Increment: it increases the number ofter this line
		//Post Increment: It prints first, then add 1
//		System.out.println(num2++);//2
//		System.out.println(num2);//3
		System.out.println("=========");
		        // 1  X 1 = 1
		System.out.println(num1+" x "+num2 +" = "+num2++);
		        // 1 X 2 = 2
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));// post increament num2 will be 3 in the next line	        
		        // 1 x 3 = 3
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));
		System.out.println(num1+" x "+num2+" = "+(num1*num2++));
		System.out.println(num1+" x "+num2+" = "+(num1*num2));//num2=10
		
		//post decrement
		System.out.println("Post Decrement : " + num2--);//num2 will be 9 at the next time
		
		//Pre Increment
		System.out.println(++num2);
		//num2++=post increment, it used the precious value then add 1
		//and ++num2=pre increment, it add 1 first, then use it on the same line


	}

}
