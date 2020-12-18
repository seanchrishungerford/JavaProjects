package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	
	public static void main(String[] args) {
		
		List <String> lst = new ArrayList<String>();
		
		System.out.println("Enter 3 strings (one at a time), one of which being in email format. ");
		
		System.out.println("Enter a string: ");
		Scanner obj1 = new Scanner(System.in);
		String stringEntered = obj1.nextLine(); 
		lst.add(stringEntered);
		
		System.out.println("Enter a string: ");
		obj1 = new Scanner(System.in);
		stringEntered = obj1.nextLine(); 
		lst.add(stringEntered);
		
		System.out.println("Enter a string: ");
		obj1 = new Scanner(System.in);
		stringEntered = obj1.nextLine(); 
		lst.add(stringEntered);

		
		Pattern pattern = Pattern.compile(regex);
		
		for(String value: lst) {
			Matcher matcher = pattern.matcher(value);
			boolean b = matcher.matches();
			if(b) {
			System.out.println("The email address in the list you entered is: " + value);
			}
		}
	}
}
