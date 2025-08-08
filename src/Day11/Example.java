package Day11;

import java.sql.*;

public class Example
{
public static void main(String[] args)
	{
 
	try {
		//Load JDBC Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
		Connection con = DriverManager.getConnection("");
		
		System.out.println("Connected Successsfully");
		con.close();
	}
		catch (Exception e)
	{
			e.printStackTrace();
			
		}
	}
}
