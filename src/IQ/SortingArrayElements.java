package IQ;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingArrayElements {

	public static void main(String[] args) {
		int a[] = { 10, 40, 27, 79, 5 };
		// Arrays.sort(a);
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));

		// sorting in Desc order
		Integer a1[] = { 10, 40, 27, 79, 5 };

		Arrays.sort(a1, Collections.reverseOrder());
		System.out.println(Arrays.toString(a1));
		
		//Binary search
		int a2[] = { 10, 40, 27, 79, 5 };
		Arrays.sort(a2);
		System.out.println(Arrays.binarySearch(a2,10));
	}

}
