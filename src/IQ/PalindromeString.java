package IQ;

public class PalindromeString {

	public static void main(String[] args) {
		String s="malayalam";
		String rev="";
		
		char c[]=s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
		rev=rev+c[i];
		}
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("the given string is a palindrome");
		}
		else {
			System.out.println("the given string is NOT a palindrome");
		}
		
		
		
		
		
		

}
}