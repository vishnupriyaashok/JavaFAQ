package IQ;

public class RemoveJunkSpecialChar {

	public static void main(String[] args) {

		String s = "&^^%%##@# jave ANd Selenium *&*^%";

		String replacedStr = s.replaceAll("[^(\\w+ ?)]","");
		System.out.println(replacedStr);
		
		
		//--------remove all white spaces
		
		String str="jave    ANd      Selenium";
		System.out.println(str.replaceAll(" ", ""));
		
		
		
		
		

	}

}//[^a-zA-Z0-9]"
//  \w- alias for [a-zA-Z_0-9]
//"whitespace"?  - allow whitespace after word, set is as optional
