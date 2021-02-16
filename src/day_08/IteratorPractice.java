package day_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

	public static void main(String[] args) {

		/*
         * Cteate:
         * List<String> capitals = new ArrayList<>();
         * add : athens, berlin, paris, london, dc then print
         * 
         * Create an Tterator object :
         * Iterator<String> listIterator = capitals.iterator();
         * and remove the capitol names that has a or i in it
         */
		
		List<String> capitals = new ArrayList<>();
		 capitals.add("athens");
		 capitals.add("berlin");
		 capitals.add("paris");
		 capitals.add("london");
		 capitals.add("dc");
		 System.out.println(capitals);  //[athens, berlin, paris, london, dc]
//		 for(String str:capitals) {
//			 if(str.contains("a") && str.contains("i")) {
//				 capitals.remove(str);  //will get exception
//				// capitals.remove();  //won't work
//			 }
//		 }
		 System.out.println(capitals);
		 Iterator<String> listIterator = capitals.iterator();
		 while(listIterator.hasNext()) {
			 String str1 = listIterator.next();
			 if(str1.contains("a") && str1.contains("i")) {
				 listIterator.remove();
				 
			 }
		 }
		 System.out.println(capitals);
	}

}
