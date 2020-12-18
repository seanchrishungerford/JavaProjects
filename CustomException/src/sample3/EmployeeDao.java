package sample3;

import java.io.FileNotFoundException;
 

 
public interface EmployeeDao {
	public void addEmployee(Employee employee) throws PerException;
	public Employee getEmployee(int employeeId);
}
