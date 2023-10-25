package stringManipulations;

public class ConsonantsAndVowels {

	public static void main(String[] args) {

		String s = "java is fun to 123 5 learn";
		s.toLowerCase();
		int vowel = 0;
		int consonants = 0;
		int no = 0;

		for (int i = 0; i <= s.length()-1; i++) {
			char c = s.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
				System.out.println("vowels are "+c);
			}
			else if(c>='a' &&c<='z') {
				consonants++;
				System.out.println("consonants are "+c);
			}
			else if(c>='0' && c<='9' ) {
				no++;
				System.out.println("nos are "+c);
				
				
			}
				
			}
		System.out.println("vowel no are "+ vowel);
		System.out.println("consonants no are "+ consonants);
		System.out.println(" no are "+ no);
		}

	}


