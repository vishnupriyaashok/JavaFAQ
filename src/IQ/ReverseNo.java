package IQ;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		//System.out.println(reverseNo(123));
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("pls enter a no");
		int num=scanner.nextInt();
		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		System.out.println(sb.reverse()
				);

	}
	public static int reverseNo(int no) {
		int rev=0;
		Scanner scanner=new Scanner(System.in);
	
		no=scanner.nextInt();
		System.out.println("enter a number");
		while(no!=0) {
			rev=rev*10+no%10;
			no=no/10;
		}
		System.out.println("reversd no is "+rev);
		return rev;
		
	}

}
