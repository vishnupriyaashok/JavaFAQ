package learnBasics;

public class Bmw extends Car{
	@Override
	public void start() {
		System.out.println("bmw class start method");
		
	}
	public void autoparking() {
		System.out.println("bmw class autoparking method");
		
	}
	public static void main(String[] args) {
		Car c=new Bmw();
		c.start();
	}

}
