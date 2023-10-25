package IQ;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static void main(String a[]) {
		int[] arr1 = { 11, 23, 34, 56, 67 };
		int[] arr2 = { 11, 23, 34, 56, 67 };
		boolean status = true;

//		if (Arrays.equals(arr1, arr2)) {
//			System.out.println("both arrays are equal");
//		} else {
//			System.out.println("both arrays are not equal");

//		}
		if (arr1.length == arr2.length) {

			for (int i = 0; i <= arr1.length - 1; i++) {
				if (arr1[i] != arr2[i]) {
					status = false;
				}
			}

		} else {
			status = false;
		}
		if(status==true) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("botha arrays are not eqaul");
		}
	}
}
