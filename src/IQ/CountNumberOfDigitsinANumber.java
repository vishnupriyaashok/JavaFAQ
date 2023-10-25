package IQ;

public class CountNumberOfDigitsinANumber {

	public static void main(String[] args) {
		int no = 123489;
		int count = 0;

		while (no > 0) {
			no = no / 10;
			count++;
		}

		System.out.println("no of digits in a given number is =" +count);

	}

}
