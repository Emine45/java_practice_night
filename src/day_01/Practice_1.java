package day_01;

public class Practice_1 {

		 //main method must be in a class
		public static void main(String[] args) {
			//public static void main(String[] args)
			//access modifier , void = return type, main=name of the method, String[]= array of string, args= argument
			//Why are using main method?
			//To run the application
			//Do we always need main method on an application?
			//Yes 
			
			//How to declare variables?
			int a;
			//How to assign a value to a variable?
			a=6;
			System.out.println(a);
			//int data type can hold an int, short, byte
			
			//How to decleare and assing value on a single line?
			double d1=5;
			double d2=6.4;
			
			//in a double data type, I can put, double, integer, or short, byte
			
			// How many data types are there?
			//2 data types: primitive, non primitive
			
			//How many primitives data types are there?
			//8.
			//Declare all primitive data type from smaller to bigger.
			
			//default is false
			boolean b=false;
			//There is ASCII tables. Every single chars has its own numerical values
			char c=' ';
			byte by=0;
			short s=0;
			int i=0;
			long l=0;
			float f=0;
			double d=0;
			//it is a good habit to initialize the variable
			System.out.println(b);
			
			//How to print the min or max values of the primitives?
			//Print the smallest and greatest value of the byte.
			by=Byte.MIN_VALUE;
			
			//The Smallest Value Of byte is -128
			//We can combines words or values using + sign. It is called concatenation
			System.out.println("The Smallest Value Of byte is "+by);
			by=Byte.MAX_VALUE;
			
			//The biggest Value Of byte is 127
			System.out.println("The Biggest Value Of byte is "+by);
			
			//Print the smallest and greatest value of the double.
			
			//4.9E-324 is The Smallest Value Of double.
			d=Double.MIN_VALUE;
			System.out.println(d+" is The Smallest Value Of double.");
			
			
			 double minValue = Double.MIN_VALUE;
	     double maxValue = Double.MAX_VALUE;
	     System.out.println("The smallest value of double is "
	               + minValue +
	               ".The biggest value of double "
	               + maxValue);
	
		
		
		
		
	}

}
