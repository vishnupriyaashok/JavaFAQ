package FAQ;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {
		String str="aaabbbccvvjjlmoppp";
		
		Map<Character,Integer> charCountMap=new HashMap<Character,Integer>();
		char[] strArr=str.toCharArray();
		
		for(char c:strArr) {
			if(c!=' ') {
			   if(charCountMap.containsKey(c)) {
				   charCountMap.put(c, charCountMap.get(c)+1); 
			   }
			   else {
				   charCountMap.put(c, 1);
			   }
		}
		  
		
		}
		
		for(Map.Entry entry:charCountMap.entrySet()) {
			System.out.println("occurence of "+entry.getKey()+" = "+entry.getValue());
		}

	}

}
