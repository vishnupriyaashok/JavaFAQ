
package FAQ;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

		for (int i = 1; i <= 6; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("sum1 " + sum1);
		int missingNo = sum1 - sum;
		System.out.println("missing no is " + missingNo);
	}
}