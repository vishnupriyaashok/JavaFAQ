package IQ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// Approach #1

//		FileReader fr = new FileReader("C:\\Users\\Andte\\Desktop\\test1.txt");
//
//		BufferedReader bf = new BufferedReader(fr);
//		String strt;
//		while ((strt=bf.readLine())!=null) {
//			System.out.println(strt);
//		}
//		bf.close();

		// Approach #2
//		
//		File file=new File("C:\\Users\\Andte\\Desktop\\test1.txt");
//		Scanner sc =new Scanner(file);
//		while(sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}

		// Approach #2
		File file = new File("C:\\Users\\Andte\\Desktop\\test1.txt");
		Scanner sc = new Scanner(file);
		sc.useDelimiter("//Z");
		System.out.println(sc.next());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
