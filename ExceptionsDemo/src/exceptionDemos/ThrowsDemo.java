package exceptionDemos;

public class ThrowsDemo {

	public static void demoProc(){
		
		try {
			throw new NullPointerException("it's being thrown")
		}
		catch(NullPointerException e2) {
			
		}
		
	}
	
	public static void main(String[] args) {
		demoProc();
	}
}
