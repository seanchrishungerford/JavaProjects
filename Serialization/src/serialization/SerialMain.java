package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialMain {
	public static void main(String[] args) {
		Employee em = new Employee("admin","admin@mail.com","mumbai");
		System.out.println(em);
		
		FileOutputStream fout = new FileOutputStream("data.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		
		oos.writeObject(em);
	}


}
