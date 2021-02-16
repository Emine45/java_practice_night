package day_04;

public class OCAType2 {
	// What is the output?
	
	public static void main(String[] args) {
		
		String str = "M ";
		str = str.concat("E ");
		String add = "S ";
		str = str.concat(add);
		str.replace("S", "T");//MES.//PAY ATTENTION TO THIS STEP IT IS NOT TO ASSIGNED TO THE str
		str = str.replace("S", "T");//MET
		str = str.concat(add);//METS
		System.out.println(str);
		//str =M E S
		//METS
		//MTS
		//METT
		//STE

	}

}
