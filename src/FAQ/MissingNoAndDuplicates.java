package FAQ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNoAndDuplicates {

	public static void duplicates(int no[]) {
		for (int i = 0; i < no.length; i++) {
			for (int j = i + 1; j < no.length; j++) {
				if (no[i] == no[j]) {
					System.out.println("duplicates found");
				}
			}
		}
	}

	public static void main(String[] args) {
		
		


			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter Array Length");
			int iArrayLength = myObj.nextInt();
			System.out.println("Enter Array Content");

			int[] arrInput = new int[iArrayLength];
			for (int i = 0; i < iArrayLength; i++) {
				arrInput[i] = myObj.nextInt();
			}

			for (int i = 0; i < iArrayLength; i++) {
				System.out.println("Array Item: " + arrInput[i]);
			}

			for (int i = 0; i < iArrayLength; i++) {
				System.out.println(arrInput[i]);
			}

			duplicates(arrInput);

			// ------duplicates
			boolean flag = false;

			Set<Integer> hSet = new HashSet<Integer>();
			for (int i : arrInput) {
				if (hSet.add(i) == false) {
					System.out.println("Hash: duplicates found");
					flag = true;
				}
			}if(flag==false) {
				System.out.println("Hash: no duplicates found");
			}

			// ------
			// missing no;
			int sum = 0;
			int sum1 = 0;
			int[] num = { 1, 2, 4, 5 };
			for (int i = 0; i < num.length; i++) {
				sum = sum + num[i];
			}
			System.out.println("sum of the array is " + sum);

			int[] num1 = { 1, 2, 3, 4, 5 };
			for (int i = 0; i < num1.length; i++) {
				sum1 = sum1 + num1[i];
			}
			int missingNo = sum1 - sum;
			System.out.println(missingNo);

		}

	}


