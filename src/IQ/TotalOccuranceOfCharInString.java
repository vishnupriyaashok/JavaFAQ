package IQ;

public class TotalOccuranceOfCharInString {

	public static void main(String[] args) {
		String s="welcome to java world";
		int len=s.length();
		int len1=s.replace("a","").length();
		int count=len-len1;
		System.out.println("no of occurance of char o are : "+count +" times");

	}

}
