package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	public static String sql = "delete from employee where empname=?";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			Class.forName("org.h2.Driver"); // load the driver
			
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			//establish the connection
			System.out.println("connected");
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, "horsham");
			
			pst.setString(2, "altaf");
			
			pst.executeUpdate();
			
			System.out.println("user is inserted");
			
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		} finally {
			
			try {
				
				conn.close();
				System.out.println("Connection closed");
				
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
			System.out.println("Finally block called");
			
		}
	}
}