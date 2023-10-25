package IQ;

import java.util.Scanner;

public class BrainFreeze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sScanner = new Scanner(System.in);
		System.out.println("enter a no");
		int arrlen=sScanner.nextInt();
		System.out.println("enter array");
		
		int[] aray =new int[arrlen];
		for(int i=0;i<arrlen;i++) {
			aray[i] = sScanner.nextInt();
		}
		
		for(int i=0;i<arrlen;i++) {
			System.out.println(aray[i]);
			}
			
	}

}



