package Day12JDBC;

import java.sql.*;
public class JDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Hema@123");
			System.out.println("Established Connection");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
		

}
