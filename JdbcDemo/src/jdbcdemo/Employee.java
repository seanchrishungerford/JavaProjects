package jdbcdemo;

public class Employee {

	private String empName;
	private String empEmail;
	private String empCity;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Employee(String empName, String empEmail, String empCity) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empEmail=" + empEmail + ", empCity=" + empCity + "]";
	}
	
	
	
	
	
	
}
