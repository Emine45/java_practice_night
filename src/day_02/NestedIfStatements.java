package day_02;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
//		Create a class : “NestedIfStatements”
//		Compare 2 birth dates 
//		Get the year, months, and day as integer
//		then find the older person using Nested if statements
//		Examples:
//		int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12, 
//		int birthYearOfMehmet=1999,birthMonthOfMehmet=8, birthDayOfMehmet=1;
//		Mehmet is Older // hard code
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Birth Year of Yusuf");
		int birthYearYusuf = scan.nextInt();
		
		System.out.println("Enter Birth Month of Yusuf");
		int birthMonthYusuf = scan.nextInt();
		
		System.out.println("Enter Birth Day of Yusuf");
		int birthDayYusuf = scan.nextInt();
		
		System.out.println("Enter Birth Year of Mehmet");
		int birthYearMehmet = scan.nextInt();
		
		System.out.println("Enter Birth Month of Mehmet");
		int birthMonthMehmet = scan.nextInt();
		
		System.out.println("Enter Birth Day of Mehmet");
		int birthDayMehmet = scan.nextInt();
		
		
		
		//Compare years, then month, then days.
		//Think about when the years are equal
		//Checking the years >>>> months >>>>> days
		//      2000               1999
			
		if (birthYearYusuf > birthYearMehmet) {
			System.out.println("Mehmet is older");
			
		}else if (birthYearYusuf<birthYearMehmet) {
			System.out.println("Yusuf is older");
			
	    }else {//birth years are same
        //BODY OF THE ELSE 
	    	      //10                  9
	    	if (birthMonthYusuf > birthMonthMehmet) {
				System.out.println("Mehmet is older");
				
				         //9              10
			}else if (birthMonthYusuf<birthMonthMehmet) {
				System.out.println("Yusuf is older");
				
		    }else {//birth month are same.  10
		    	 //BODY OF ELSE 
	    	     //SO FAR: They both born in year:2000 month: 10/
		    	 //HERE: we are comparing their birthday DAYs
		    	 //   20              19
	    	if (birthDayYusuf > birthDayMehmet) {
				System.out.println("Mehmet is older");
				
				         //19              20
			}else if (birthDayYusuf<birthDayMehmet) {
				System.out.println("Yusuf is older");
				
		    }else {//they born same year,month,day
		    	System.out.println("They born same year,same month, same day");
		     }
	    	
	    	scan.close();
		   }
	    }
		
		}

	}


