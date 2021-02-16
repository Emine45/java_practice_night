package day_08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		  //Set is used to store unique elements
        //Set doesn't keep the order
        Set<Integer> phoneNumber=new HashSet<>();
        phoneNumber.add(5112244);
        phoneNumber.add(6112244);
        phoneNumber.add(9112233);
        phoneNumber.add(5112244);
        phoneNumber.add(1112233);
        System.out.println(phoneNumber);  //[9112233, 6112244, 1112233, 5112244]
        
//      hash set is fast, treeset is slow
//      hash set no order, treeset ascending order
//      no set allows duplicate elements
        Set<Integer> ssn=new TreeSet<>();
        ssn.add(5112233);
        ssn.add(8612233);
        ssn.add(1154233);
        ssn.add(3112883);
        ssn.add(1154233);
        System.out.println(ssn);  //[1154233, 3112883, 5112233, 8612233]
    }
}
