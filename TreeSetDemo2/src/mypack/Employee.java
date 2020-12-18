package mypack;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private String empCity;
	public Employee(int empId, String empName, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}
	
	public String toString() {
		return "Employee empId= " + empId  + " EmpName= " + empName + " empCity= " + empCity;
	}

	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.getEmpId()-this.empId;
	}

	
}
