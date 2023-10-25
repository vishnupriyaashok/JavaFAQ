package IQ;

import java.util.Scanner;

public class PermutionCombination {

	public static void permution(String str, String ans) {
		if (str.length() == 0) {
			System.out.println("string length  "+str.length());
			System.out.println(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println("character at i  " +str.charAt(i));
			String leftSubString = str.substring(0, i);
			System.out.println("leftSubString  "+ leftSubString);
			String rightSubString = str.substring(i + 1);
			System.out.println("rightSubString  "+ rightSubString);
			String rest = leftSubString + rightSubString;
			System.out.println("rest "+ rest);
			System.out.println("*****calling the method **** ");
			permution(rest, ans + c);
			System.out.println("----------------------");
		}

	}

	public static void main(String[] args) {
		String ans = " ";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String string = scanner.nextLine();
		
		permution(string,ans);
	}

}
