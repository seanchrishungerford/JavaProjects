package sample3;

import java.io.FileNotFoundException;
 



 
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee = new Employee();
		EmployeeDao employeeDao = new EmployeeDaoImpl();
	 	 
			try {
				employeeDao.addEmployee(employee);
			} catch (PerException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		 
		 
	}

}
