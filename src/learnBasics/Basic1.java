package learnBasics;

public class Basic1 {

	public static void main(String[] args) {
		char ch = "123".charAt(1);
		System.out.println(ch);
		System.out.println(ch++ + ++ch);

		String s = "1".repeat(2);
		System.out.println(s);

		String name = "JavaConceptOfTheDay".substring(4);
		System.out.println(name);
		
		String str = "  Java\tConcept\tOf\tThe\tDay  ".strip();
        System.out.println(str);
        
        String str1 = "Java";
        
        String str2 = new String("Java");         
        System.out.println(str1 == str2);         
        System.out.println(str1.equals(str2));        
        System.out.println(str1.hashCode() == str2.hashCode());
        
        System.out.print("0".indent(0));
        System.out.print("1".indent(1));
        System.out.print("2".indent(2));
        System.out.print("3".indent(3));
        System.out.print("4".indent(4));
        System.out.print("5".indent(5));
        
        //System.out.println("Java Concept Of The Day".substring(8, 4));
        StringBuffer sb1 = new StringBuffer("11111");
        
        StringBuffer sb2 = sb1.append(22222).reverse();
        System.out.println(sb1==sb2);
        
        
	}

}
