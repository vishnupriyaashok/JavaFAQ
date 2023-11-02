package FAQ;

public class SwapNoWithOutVariable {

	
	public static void swap(int a,int b) {
		//a=10,b=5
		a=a+b;//15
		b=a-b;//10
		a=a-b;//5
		
		System.out.println("after swapping value of a "+a);
		System.out.println("after swapping value of b "+b);
		
	}
	
	
	public static void main(String[] args) {
		
		swap(10,5);
	}

}
