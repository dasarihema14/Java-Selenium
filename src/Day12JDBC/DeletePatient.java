package Day12JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletePatient {
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Hema@123");
    String sql="DELETE FROM patient";
    
	
	PreparedStatement pstmt=con.prepareStatement(sql);

	
	
	int rows=pstmt.executeUpdate();

System.out.println("Deleted....");

con.close();
}catch(Exception e) {
e.printStackTrace();

}
}
}

