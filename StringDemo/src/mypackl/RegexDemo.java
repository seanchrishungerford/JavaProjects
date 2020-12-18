package mypackl;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s"); //repr single char before s
		Matcher m = p.matcher("asssure");
		
		boolean res = m.matches();
		System.out.println(res);
		
		//another way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		System.out.println(b2);
	}
}
