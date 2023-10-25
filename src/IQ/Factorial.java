package IQ;

public class Factorial {

	public static void main(String a[]) {
//		int num = 5;
//		int factorial = 1;
//
//		for (int i = 1; i <= num; i++) {
//			factorial = factorial * i;
//		}
//		System.out.println(factorial);
//
//		// descending order
//
//		int k = 5;
//		int factoria1 = 1;
//		for (int i = k; i >= 1; i--) {
//			factoria1 = factoria1 * i;
//		}
//		System.out.println(factoria1);

		
		calcFactorial(6);
		
	}

	public static int calcFactorial(int f) {
		System.out.println("Start" + f);
		
		if (f == 1) {
			return 1;
		} 
		
	   f = f * calcFactorial(f - 1);
	   
	   System.out.println("After Recursion" + f);
	   
	   return f;	
	}
	
	
	
	
}
