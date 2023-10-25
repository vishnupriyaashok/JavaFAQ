package IQ;

public class ReverseString {

	public static void main(String[] args) {
		String s="Learning java";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);	
		}
		System.out.println(rev);
	
	
	String s1="Learning java and python";
	String j="";
	char a[]=s1.toCharArray();
	
	for(int i=a.length-1;i>=0;i--) {
		j=j+a[i];
		
	}
	System.out.println(j);
	
	
	String s3="Learning java and python and c";
	StringBuffer str=new StringBuffer(s3);
	System.out.println(str.reverse());
	
	

}
}