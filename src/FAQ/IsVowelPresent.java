package FAQ;

public class IsVowelPresent {

	public static void isVowelPresent(String str) {

		str.toLowerCase();
		char[] carr = str.toCharArray();

		for (int i = 0; i < carr.length; i++) {
			if (carr[i] == 'a' || carr[i] == 'e' || carr[i] == 'i' || carr[i] == 'o' || carr[i] == 'u') {
				System.out.println("Vowels present are " + carr[i]);
			}
			
		}System.out.println("no vowels");
		
	}
	public static boolean vowels(String str) {
		return str.matches(".*[aeiou].*");
		
	}
	

	public static void main(String[] args) {
		isVowelPresent("k333aaaii33kk");
		System.out.println(vowels("pppp"));

	}

}
