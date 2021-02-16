package day_08;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {

		/*
		 * 1. Create Queue of Integer with object type if LinkedList : link
         * add the numbers: 45,54,26,63
         * print
         * remove the fist element without using any index(poll) and print
         * remove the next element and print
         * print the next element without removing
         * 
         * 2. Create:
         * Queue<Integer> pque = new PriorityQueue<>();
         * add teh same numbers and print
         * use poll and peek fictions to manipulate the data
         * 
         * 
         * 3. What is the major differences between linkedList and PriorityQueue
		 */
		
		Queue<Integer> link = new LinkedList<>();
		link.add(45);
		link.add(54);
		link.add(26);
		link.add(63);
		System.out.println(link);  //[45, 54, 26, 63]
		link.remove();
		System.out.println(link);  //[54, 26, 63]
		
		System.out.println(link.poll());  //54
		System.out.println(link);  //[26, 63]
		
		System.out.println(link.peek());  //26
		System.out.println(link);  //[26, 63]
		
		/*
		 * 2. Create:
         * Queue<Integer> pque = new PriorityQueue<>();
         * add teh same numbers and print
         * use poll and peek fictions to manipulate the data
		 */
		
		System.out.println("=========PriorityQueue==========");
		Queue<Integer> pque = new PriorityQueue<>();
		pque.add(45);
		pque.add(54);
		pque.add(26);
		pque.add(63);
		System.out.println(pque);  //[26, 54, 45, 63]
		
		System.out.println(pque.poll());  //26
		System.out.println(pque);  //[45, 54, 63]
		System.out.println(pque.poll());  //45
		System.out.println(pque);  //[54, 63]
		System.out.println(pque.poll());  //54
		System.out.println(pque);  //[63]
		System.out.println(pque.poll());  //63
		System.out.println(pque);  //[]
		
		/*
		 * 3. What is the major differences between linkedList and PriorityQueue
		 * linkedList: FIFO when you remove the data
		 * PriorityQueue: Removes the smallest to greatest in order
		 */
	}

}
