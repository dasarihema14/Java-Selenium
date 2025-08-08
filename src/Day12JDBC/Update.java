package Day12JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Hema@123");
	
		
			String q = "UPDATE student SET city = ? WHERE StudentName = ?";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			
		
				/*pstmt.setString(1,"Bhanu");
				pstmt.setString(2, "Hema");
				int rows=pstmt.executeUpdate();*/
			 String[][] data = {
		                {"Charan", "Hyderabad"},
		                {"Bharati", "Vijayawada"},
		                {"Sravani", "Rajahmundry"}
		            };

		            for (String[] row : data) {
		                pstmt.setString(1, row[1]); 
		                pstmt.setString(2, row[0]); 
		                int rows=pstmt.executeUpdate();
		            }
			
			
			
			System.out.println("Inserted");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
		

}
