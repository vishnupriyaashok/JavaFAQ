package FAQ;

import java.util.Scanner;

public class Prime {
	public static void prime(int no) {
		boolean isPrime = false;

		for (int i = 2; i <= no / 2; i++) {
			if (no % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (!isPrime) {
			System.out.println("the given  is prime");
		} else {
			System.out.println("the given  is not prime");

		}

	}

	public static void primeNo(int no) {
		int count = 0;
		if (no > 1) {
			for (int i = 1; i <= no; i++) {
				if (no % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("no is prime");
			} else {
				System.out.println("no is not a prime");
			}

		}

	}



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no");
		int no = scanner.nextInt();
		// primeNo(no);
	

	}

}
