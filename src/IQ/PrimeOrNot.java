package IQ;

public class PrimeOrNot {

	public static void main(String[] args) {
		int no=19;
		int count = 0;
		
		if(no>1) {
			for(int i=1;i<=no;i++) {
				if(no%i==0)
					count++;	
			}
			if(count==2) {
				System.out.println("the given no is prime");	
			}
			else {
				System.out.println("the given no is not prime");
			}
		}
		else {
			System.out.println("the given no is not a prime no");
		}
		
		
		
		
		
		
	}

}
