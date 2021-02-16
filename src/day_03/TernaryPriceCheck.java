package day_03;

public class TernaryPriceCheck {

	public static void main(String[] args) {
		
		/*
		   Write a code using ternary:
           Create int variable : price Create string variable : decision
           If the price = $10 Print “cheap”
           If price is 10-$20 print “ok” 
           Otherwise “expensive”.
           Enter positive number only
		 */
		
		int price = 10;
		String decision = ""; //use this variable to assign cheap, ok, expensive
	//	if(price>=1 && price<=10) {
	//		decision = "cheap";
	//	}else {
	//		if(price>=11 && price<=20) {
	//			decision = "ok";
	//		}else {
	//			decision ="expensive";
	//		}
	//	}
	
		
		decision = (price>=1 && price<=10) ? "cheap"
				   : (price>=11 && price<=20) ? "ok"
				      :"expensive";	
		System.out.println(decision);

	}

}
