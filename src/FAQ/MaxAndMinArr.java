package FAQ;

public class MaxAndMinArr {


	public static int minArr(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {	
				min=arr[i];
			}		
		}return min;

	}
	
	public static int maxArr(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];	
			}
		}return max;
		
	}
	
	

	public static void main(String[] args) {
		int[] arr = { 99,345,12, 23, 35,10, 67, 78 };
		
		int min=minArr(arr);
		System.out.println(min);
		
		int max=maxArr(arr);
		System.out.println(max);
		
	
		
	}
}