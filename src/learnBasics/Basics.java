
package learnBasics;

public class Basics {
	public Basics login() {
		System.out.println("login fuction added");
		return this;
	}
	public static void main(String args[]) {
		int a=1;
		a++;
	    int b=a++;
		System.out.println(a);//3
		System.out.println(a);//3
		System.out.println(b);//2
		System.out.println("---------");
		--a;
		System.out.println(a);
		
		int c=5;
		c--;
		int d=c;
		
		System.out.println(c);
		System.out.println(d);
		Basics bs=new Basics();
		bs.login();
	}

}
