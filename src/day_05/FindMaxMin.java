package day_05;

import java.util.Arrays;

public class FindMaxMin {

	public static void main(String[] args) {

		/*
		  Task1: Given an int array, write a method to find the biggest number.
          Create a void method : findMax 
          It should take an int array as parameter
          And print the max biggest number in that array
          e.g.
          int list[] = { 1, 3, 24, 5, 6, -7, 5, 0, 10, 9, 19, };
          Output: Max : 24
          ============================
          Task2: Given an int array, write a method to find the smallest number.
          Create a void method : findMin 
          It should take an int array as parameter
          And print the smallest number in that array
          e.g.
          int list[] = { 1, 3, 24, 5, 6, -7 };
          Output: Max : -7
	   */
		
		int list[] = { 1, 3, 24, 5, 6, -7 };
		findMin(list);
		findMax(list);
		
		}
	
	public static void findMin(int[] nums) {
		Arrays.sort(nums);  //-7,1,3,5,6,24
		//                     0,1,2,3,4,5
		System.out.println(nums[0]);
	 
	}
	
	public static void findMax(int[] nums) {
		Arrays.parallelSort(nums);
		System.out.println(nums[nums.length-1]);
	}

}
