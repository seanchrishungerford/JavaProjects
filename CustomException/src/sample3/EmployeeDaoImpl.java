package sample3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee employee) throws PerException {
		 
			try {
				FileOutputStream fos= new FileOutputStream("c:\\");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				throw new PerException("not able to persist" ,e);
			}
		 

	}

	@Override
	public Employee getEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
