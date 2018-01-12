package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class sqlconnctr {
	@Test
	public void testdb() throws Throwable
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","root");
		Statement smt =con.createStatement();
		ResultSet rs= smt.executeQuery("select * from seleniumuser");
		while(rs.next())
		{
			String name=rs.getString("name");
			System.out.println("Names are:-"+name);
			String pwd=rs.getString("pwd");
			System.out.println("pwd are:-"+pwd);
		}
	}

}
