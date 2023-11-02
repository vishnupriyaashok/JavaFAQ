import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList();
		strList.add("java");
		strList.add("Selenium");
		strList.add("Phython");
//---------------
		System.out.println("using while loop");
		Iterator<String> it = strList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
//------------------
		System.out.println("using for each loop");
		for(String str:strList) {
			System.out.println(str);			
		}
//-----------------------
		System.out.println("using for loop");
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
			
		}
	}

}
