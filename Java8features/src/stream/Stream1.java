package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		
	
	List<String> al = new ArrayList<String>();
	
	al.add("admin");
	
	al.add("manager");
	al.add("amar");
	
//	al.stream().filter((s)->s.startsWith("a")).map(String :: toUpperCase).forEach(System.out :: println);
	
	List <String> upp = al.stream().sorted().map(String :: toUpperCase).collect(Collectors.toList());
	System.out.println(upp);
	
	}
	
}
