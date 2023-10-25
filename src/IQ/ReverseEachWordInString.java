package IQ;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// Approach #1 
		
		String str="i like to learn java";
		String []a=str.split(" ");
		String reverseWord = "";
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			StringBuffer sb=new StringBuffer(a[i]);
			reverseWord=reverseWord+sb.reverse().toString()+" ";
		}
		
		System.out.println(reverseWord);
		
		
		// Approach #2
		
		String str1="Welcome to coding world";
		String reverseString="";
		
		String []a1=str1.split(" ");
		
		for(String s:a1) {
			String reverseStr="";
			for(int i=s.length()-1;i>=0;i--) {
				reverseStr=reverseStr+s.charAt(i);
			}
			reverseString=reverseString+reverseStr+ " ";
		}
		System.out.println(reverseString);
	}
	}

