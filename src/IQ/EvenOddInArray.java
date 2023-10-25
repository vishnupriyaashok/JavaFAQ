package IQ;

public class EvenOddInArray {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 8, 6, 11 };
//		int even = 0;
//		int odd = 0;
//
//		for (int i = 0; i <= num.length - 1; i++) {
//			if (num[i] % 2 == 0) {
//
//				even++;
//			} else if (!(num[i] % 2 == 0)) {
//				odd++;
//			}
//
//		}
//		System.out.println("count of even no " + even);
//		System.out.println("count of odd no " + odd);
		
		//findEvenno(num)	;
		findOddno(num);
		

	}

	public static void findEvenno(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]+",");
			}
		}

	}
	public static void findOddno(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i]+",");
			}
		}

	}
	
}