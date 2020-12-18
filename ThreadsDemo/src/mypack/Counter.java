package mypack;

public class Counter extends Thread {

	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				
			}
			System.out.println(i);
		}
	}
}
