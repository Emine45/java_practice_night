package day_04;

public class WarmUp {

	public static void main(String[] args) {
//		Print even numbers between 1-20 inclusive e.g.2,4,6,..,20
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 && i <= 19) {
				System.out.print(i + ",");
			} else if (i == 20) {// we need to pay attention to the edge cases
				System.out.println(i);
			}
		}
//		Print odd numbers between 1-20 inclusive.e.g 1,3,5,7,…,19
		for (int i = 1; i <= 10; i++) {
			if (i < 10) {
				System.out.print(2 * i - 1 + ",");// printing odd numbers when i<10
			} else if (i == 10) {
				System.out.println(2 * i - 1);
			}
		}
		// With Do While Loop
		int i = 1;
		do {
			if (i != 19) {
				System.out.print(i + ",");
			} else if (i == 19) {
				System.out.println(i);
			}
			i += 2;
		} while (i <= 20);
//		Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,..
		for (int j = 20; j >= 1; j--) {
			if (j % 5 == 0 && j > 5) {
				System.out.print(j + ", ");
			} else if (j % 5 == 0 && j <= 5) {
				System.out.println(j);
			}
		}
//		Find the sum of all even numbers form 1 - 20 inclusive
		int sum = 0;
		for (int k = 1; k <= 10; k++) {
			sum += 2 * k;// 2*1=2, 2*2=4, 2*3=6, 2*4=8,....,2*10=20,
		}
		System.out.println(sum);
//		Print sum of all numbers from 1-20 except 11 or 15
		int sum2 = 0;
		for (int m = 1; m <= 20; m++) {
			if (m != 11 && m != 15) {
				sum2 = sum2 + m;
			}
		}
		System.out.println(sum2);
//			Print all numbers from 1-20 except 11 or 15. 1 2 3 4 ... 10 12 13 14 16...18 19 20
		for (int z = 1; z <= 20; z++) {
			if (z == 11 || z == 15) {
				continue;// skip. What is the difference between continue and break?
			}
			System.out.print(z + " ");
		}
	

	}

}
