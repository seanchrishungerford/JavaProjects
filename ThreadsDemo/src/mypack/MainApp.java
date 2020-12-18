package mypack;

public class MainApp {

	public static void main(String[] args) {
		ThreadDemo2 th = new ThreadDemo2();
		
		Thread t = new Thread(th);
		t.start();
	}
}
