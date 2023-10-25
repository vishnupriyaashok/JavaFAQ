package IQ;

public class EvenAndOdd {

	public static void main(String[] args) {
		int no=1234568;
		int rev=0;
		int odd=0;
		int even=0;
//		
//		
//			if(no%2==0) {
//				System.out.println("the gievn no is even");
//			}
//			else {
//				System.out.println("the given no is odd");
//			}
			
			
			//count of even and odd
		
		while(no>0) {
			rev=rev*10+no%10;
			no=no/10;
			if(no%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.println("even no count is :"+even);
		System.out.println("odd no count is : "+odd);
		System.out.println(rev);

}
}