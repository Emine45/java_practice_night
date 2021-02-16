package day_01;

public class AgesAndStages {
	public static void main(String[] args) {
		     /*
			 * Create appropriate variables and assign them ages and stages as you see below
			 *and name your variables according to stages to print following outputs:
			 *newborn = 0 - 2 months //Want to print these on the console
			 *infant = 2 months - 1 year
			 *toddler = 1 - 3
			 *preSchooler = 3 - 5
			 *schooler = 5 - 12
			 *teenager = 12 - 18
			 *youngAdult = 18 - 40
			 *middleAdult = 40 - 65
			 *senior = 65 ...
			 *
			 */
		
		//Create appropriate variables and assign them ages
		int newborn=0;
		double infant= 0.2;
		int toddler = 1;
		int preschooler = 3;
		int schooler = 5;
		int teenager = 12;
		int youngAdult = 18;
		int middleAdult = 40;
		int senior = 65;
		 
		//PRINT newborn = 0 - 0.2 years
		//We need to understandend how declaration and assigning values of variables works.
        //Because we want our codes DYNAMIC
		
		System.out.println("newborn = " + newborn +" - " +infant+ " years");
		
		//THIS IS NOT DYNAMIC. THIS IS HARD CODED.
		System.out.println("newborn = 0 - 0.2 years");
		
		System.out.println("infant = " + infant + " - " + toddler + " years");
		
		System.out.println("toddler = " + toddler + " - " + preschooler + " years");
		
		System.out.println("preschooler = " + preschooler + " - " + schooler + " years");
		
		System.out.println("schooler = " + schooler + " - " + teenager + " years");
		
		System.out.println("teenager = " + teenager + " - " + youngAdult + " years");
		
		System.out.println("youngAdult = " + youngAdult + " - " + middleAdult + " years");
		
		System.out.println("middleAdult = " + middleAdult + " - " + senior + " years");
		
		
		
		
		
		
	}

}
