package mypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;


public class EmployeeImp implements Employee {

	public void addEmployee(Emp e) throws UserException {
		
	try {
			FileOutputStream fout = new FileOutputStream("c:\\");
	
	}
	catch(FileNotFoundException e1){
		throw new UserException("something went wrong...try after sometime" , e1);
	}
	
	
	
}
	}
