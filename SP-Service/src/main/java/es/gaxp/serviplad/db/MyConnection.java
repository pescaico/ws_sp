package es.gaxp.serviplad.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	 

	public Connection getConnection() throws Exception {
		try {
			String connectionURL = "jdbc:mysql://localhost:3307/serviplad";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "serviplad", "123ServPl4d");
			return connection;
		}
		catch (SQLException e){
				throw e;
		}
		catch (Exception e)
		{
			throw e;
		}
	}
}