
package IQ;

import java.nio.charset.Charset;
import java.util.Random;

public class RandomNoAndStrings {

	public static void main(String[] args) {
//		byte[] array = new byte[7]; // length is bounded by 7
//	    new Random().nextBytes(array);
//	    String generatedString = new String(array);
//
//	    System.out.println(generatedString);
		
		
		System.out.println(generateRandomChars("javalearning",5));
		
		
	}

	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}

}
