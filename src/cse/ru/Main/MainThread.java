package cse.ru.Main;

class MyThread implements Runnable{
	public void run()
	{
		System.out.println("Inside MyThread");
	}
}

public class MainThread {

	public static void main(String[] args) {
		MyThread MyObj = new MyThread();
		Thread Th = new Thread(MyObj);
		Th.start();

	}

}
