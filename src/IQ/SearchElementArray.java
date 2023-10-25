package IQ;

public class SearchElementArray {

	public static void main(String[] args) {
		int a[]= {10,20,31,40,50};
		int searchNo=30;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==searchNo) {
				System.out.println("SeachElement Found at "+i);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("SeachElement is not Found");
		}
		
	}

}
