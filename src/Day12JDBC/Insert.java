package Day12JDBC;
import java.sql.*;

public class Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Hema@123");
	
		
			String q = "DROP TABLE table1";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, "sai");
			pstmt.setString(2, "hyb");
			
		
			System.out.println("Inserted");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
		

}

