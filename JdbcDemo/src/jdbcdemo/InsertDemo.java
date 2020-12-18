package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertDemo {
	static String sql = "insert into employee(empname, email, city) values(?, ?, ?)";
	public static void main(String[] args)  {
		try {
			Class.forName("org.h2.Driver"); //load the driver
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa",""); //establish the connection username is sa and no password
			System.out.println("connected");
			Scanner scan = new Scanner(System.in);
			String empName, empEmail, empCity;
			System.out.println("Please enter Employee name: ");
			empName =scan.nextLine();
			System.out.println("Please enter Employee email: ");
			empEmail = scan.nextLine();
			System.out.println("Please enter Employee city: ");
			empCity = scan.nextLine();
			Employee emp = new Employee(empName, empEmail, empCity);
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, emp.getEmpName());
			pst.setString(2, emp.getEmpEmail());
			pst.setString(3, emp.getEmpCity());
			pst.executeUpdate();
			System.out.println("user is inserted");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block called");
		}
	}
}