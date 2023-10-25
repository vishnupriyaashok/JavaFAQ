package IQ;

public class SumOfNoInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		
//using for each loop
		int b[] = { 1, 2, 3, 4, 5 };
		int sm=0;
		for (int value : a) {
			sm=sm+value;
		}
		System.out.println(sm);

	}
}