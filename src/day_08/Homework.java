package day_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework {

	public static void main(String[] args) {
		/*
	     * create a list of arrayList
	     * add the course:
	     * java, selenium, testing, unit, cucumber,api,sql,database,sdlc
	     * print the elements from index 2 to index 7 using EXAMPLE: list.subList(2,7);
	     * using iterators, remove if the string value has e and t
	     * 
	     */
		
		List<String> course = new ArrayList<>();
		course.add("java");
		course.add("selenium");
		course.add("unit");
		course.add("cucumber");
		course.add("api");
		course.add("sql");
		course.add("database");
		course.add("sdlc");
		System.out.println(course);  //[java, selenium, unit, cucumber, api, sql, database, sdlc]

		
		System.out.println(course.subList(2, 7));  //[unit, cucumber, api, sql, database]
		
		 Iterator<String> listIterator = course.iterator();
		 while(listIterator.hasNext()) {
			 String crs = listIterator.next();
			 if(crs.contains("e") && crs.contains("t")) {
				 listIterator.remove();
			 }
		 }
		 System.out.println(course);  //[java, selenium, unit, cucumber, api, sql, sdlc]

	}

}
