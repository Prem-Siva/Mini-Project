package Stock_trading_simulator;
import java.sql.*;
public class Database {
	
	private Connection con;
	
	Database()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			this. con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","073331817");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Database.java "+e.getMessage());
		}
	}
	public Connection getConnection()
	{
		return con;
	}
}
