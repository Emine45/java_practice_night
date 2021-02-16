package day_04;

public class Stairs {

	public static void main(String[] args) {
		
		 //Print the image below. This is a loop question
		 // 1 *
         // 2 * *
         // 3 * * *
         // 4 * * * *
         // 5 * * * * *
         // 6 * * * * * *
		 
		String star = "*";
		for(int i =1; i<=6; i++) {
			System.out.println(i + " " + star);  //1 star  //2 star
	          star=star.concat("*");  //adding one star every single time
			//star+="*"; // ==> same
			//star=star+"*"; // ==> same
		}
		

	}

}
