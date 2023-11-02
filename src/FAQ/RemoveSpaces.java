package FAQ;

public class RemoveSpaces {
	
	public static String removeSpaces(String str) {
		return str.replace(" ", "");
	}
	
	//using StripMethod :remove leading and trailing whitespaces
	public static String removeSpaces1(String str) {
		return str.strip();
	}
	
	public static String removeSpaces2(String str) {
		return str.trim();
	}


	public static void main(String[] args) {
	
		
		System.out.println(removeSpaces2("   java is fun to learn    "));
		

		
	}

	
}
