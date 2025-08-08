package Day12JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertString {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Hema@123");
	
		
			String q = "insert into student( StudentName, city) values(?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			String [][] data=
				{
						{"Charan","vij"},
						{"Bharati","Eluru"},
						{"Sravani","WGodavari"}
				};
			for(String[] row:data)
			{
				pstmt.setString(1, row[0]);
				pstmt.setString(2, row[1]);
				pstmt.executeUpdate();
			}
			
			
			
			System.out.println("Inserted");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
		


}
