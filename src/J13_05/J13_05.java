package J13_05;

class A implements Runnable{
	public void run() {
		for(int i = 1; i<=5; i=i+2) {
			System.out.println("Inside Thread A : i = "+i);
			
		}
		System.out.println("Exit From A.");
	}
}
class B implements Runnable{
	public void run() {
		for(int j = 2; j<=6; j=j+2) {
			System.out.println("Inside Thread B : j = "+j);
		}
		System.out.println("Exit From B.");
	}
}

public class J13_05 {

	public static void main(String[] args) {
		A ObjA = new A();
		Thread Th1 = new Thread (ObjA);
		B ObjB = new B();
		Thread Th2 = new Thread (ObjB);
		
		System.out.println("Starting Thread A:");
		Th1.start();
		
		System.out.println("Starting Thread B:");
		Th2.start();
		
		System.out.println("Exit From Main Thread.");
	}

}
