package loops;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// Write a program that reads a set of integers, and then prints the sum of the
		// even and odd integers.

		int no = 123456;
		int even = 0;
		int odd = 0;

		while (no > 0) {
			if (no % 2 == 0) {
				System.out.println("no is even");
				even = even +no;
				even++;
				
			} else {
				System.out.println("no is odd ");
				odd = odd+no;
				odd++;
				
			}
			System.out.println("sum of even no : "+even);
			System.out.println("sum of odd no : "+odd);
			
			no=no/10;
		}

	}

}
