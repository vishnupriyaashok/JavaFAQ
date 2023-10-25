package stringManipulations;

public class Basics {

	public static void main(String[] args) {
		String Original_String = "Java Exercises!";
		char c[] = Original_String.toCharArray();
		System.out.println("character at the /'0'/ postion is " + c[0]);
		System.out.println("character at the /'10'/ postion is " + c[10]);
		System.out.println(Original_String.codePointCount(0, 1));

		System.out.println("****************************");

		String str1 = "This is Exercise 1";
		String str2 = "This is exercise 1";
		System.out.println(str1.compareTo(str2));

		System.out.println(str1.contains("is"));
		System.out.println(str1.contentEquals(str2));

		char ch[] = { '1', '2', '3', '4' };
		System.out.println("****************************");

		String s = String.copyValueOf(ch, 0, 3);
		
		System.out.println("************"+ s);

	}

}
