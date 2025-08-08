package Day12JDBC;

import java.sql.*;

public class TableCreation {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Hema@123");
			System.out.println("Established Connection");
			
			String q = "CREATE TABLE patient(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), age INT, disease VARCHAR(100), admission_date DATE,  doctor VARCHAR(100) )";
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table Created");
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
		

}