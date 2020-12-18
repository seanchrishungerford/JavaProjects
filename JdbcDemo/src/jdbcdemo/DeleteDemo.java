package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteDemo {
public static void main(String[] args) {
		
		String sql="delete from employee where empname=?";
		
		try {
			
		
		Class.forName("org.h2.Driver");
		
		Connection conn= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "amar");
		
		
		pst.executeUpdate();
		
		System.out.println("user is deleted");
		
		}
		catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		} finally {
			System.out.println("finally block called");
		}
	}
}