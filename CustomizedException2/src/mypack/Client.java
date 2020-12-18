package mypack;


import java.io.FileNotFoundException;


public class Client {

	public static void main(String[] args) {
		
	
	Emp emp = new Emp("admin", "mumbai");
	
	Employee e = new EmployeeImp();
	
	try {
		e.addEmployee(emp);
	} catch (UserException e1) {
		// TODO Auto-generated catch block
		System.out.println(e1.getMessage());
	
	}
}
}