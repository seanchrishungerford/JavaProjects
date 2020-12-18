package exceptionDemos;

public class TryCatchDemo1 {
	public static void main(String[] args) {
	
	try {
		
		
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	
	int c = b / a;
	}
	catch (ArithmeticException e){ // e is instance of AE
	System.out.println("Hey ...args. i catch you.. " + e);
	}
	catch(ArrayIndexOutOfBoundsException e2) {
		System.out.println("No value found " + e2);
	}
	catch(Exception e) { //super exception, should always be handled last
		System.out.println("inside main");
	}
		
	finally {
		System.out.println("inside finally");
	}
	
	}
	
}
