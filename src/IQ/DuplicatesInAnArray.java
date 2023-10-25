package IQ;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
//		boolean flag=false;
//		int arr[]= {20,10,30,31,45,60,10,20};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("duplicatres are "+arr[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("no duplicates in this array");
//		}
//		
	//using hashset
		boolean flag=false;
		
		int arr[]= {20,10,30,31,45,60,};
		Set<Integer> s=new HashSet<>();
		for(int i:arr) {
		 if(s.add(i)==false) {
			System.out.println("Duplicate found ");
			flag=true;
		}
		 
		}if(flag==false) {
			System.out.println("no duplicates in this array");
		}

	}


}