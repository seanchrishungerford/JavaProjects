package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ResultSetDemo {
	public static void main(String[] args)  {
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		
		
		String sql = "select * from employee" ;
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver"); // load the driver 
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa",""); // establish the connection
			
		
			PreparedStatement pst = conn.prepareStatement(sql); // write the statement
	 		
			ResultSet rs = pst.executeQuery(); //execute the statement
			
			while(rs.next()) {
//				String name = rs.getString(1);
//				String email = rs.getString(2);
//				String city = rs.getString(3);
//				System.out.println("name is : " +name + " email is :  " + email + " city is : " + city);
				
				Employee e = new Employee(rs.getString(1), rs.getString(2), rs.getString(3));
				al.add(e);
			}
			
		
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.err.println("finally blocked called");
			
		}
		
	}
}
