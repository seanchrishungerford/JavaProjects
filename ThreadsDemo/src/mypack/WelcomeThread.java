package mypack;

public class WelcomeThread {
	public static void main(String[] args) {
		
//		Thread t = Thread.currentThread();
//		
//		System.out.println("Welcome " + t);
//		
//		t.setName("Sean");
//		t.setPriority(Thread.MAX_PRIORITY);
//		
//		System.out.println("Welcome " + t);
		
		System.out.println("Welcome ");
		
		try {
			Thread.sleep(2000);
			System.out.println("to ");
			
			Thread.sleep(2000);
			
			System.out.println("hcl");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
