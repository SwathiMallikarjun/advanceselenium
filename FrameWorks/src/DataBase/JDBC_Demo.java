package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC_Demo 
{
	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodatabase","root","hello");
		System.out.println("Connection Established");
		System.out.println();
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("select * from demotable");
		while(res.next())
		{
			String FirstName=res.getString("FirstName");
			System.out.println("FirstName value is "+FirstName);
			String Email=res.getString("Email");
			System.out.println("Email value is "+Email);
			System.out.println();
		}
	}
}