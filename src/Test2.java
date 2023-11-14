
public class Test2 {

	public static void prime(int no) {
		boolean isPrime = false;

		for (int i = 2; i <=100 / 2; i++) {
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
	
	
	public static boolean isPrime(int no){
		if(no==0||no==1) {
			return false;
		}
		for(int i=2;i<no/2;i++) {
			if(no%i==0) {
				return false;
			}
		}return true;
	
	}

	public static void printAllPrime(int no) {
		for(int i=2;i<=no;i++) {
			if(isPrime(i)) {
				System.out.print(i+", ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		//prime(11);
		System.out.println(isPrime(11));
		printAllPrime(100);

	}

}
