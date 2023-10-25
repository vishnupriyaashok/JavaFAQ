package IQ;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Pls enter a no :");
		int no = scanner.nextInt();
		int orgno = no;

		int rev = 0;

		while (no != 0) {

			rev = rev * 10 + no % 10;
			no = no / 10;

		}
		if (orgno == rev) {
			System.out.println("the no is a palindrome no ");
		} else {
			System.out.println("the no is not a palindrome no");
		}

	}

}
