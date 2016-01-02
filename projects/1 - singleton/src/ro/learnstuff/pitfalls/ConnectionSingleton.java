package ro.learnstuff.pitfalls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionSingleton {

	// thread safe singleton for connection
	private static ThreadLocal<Connection> connection = new ThreadLocal<>();

	// open connection
	public static Connection getConnection() {
		if (connection.get() == null) {
			Properties props = getPorperties();
			try {
				Class.forName(props.getProperty("Driver"));
				// open this connection
				// !we never close this connection
				connection.set(DriverManager.getConnection(props.getProperty("Url"), props.getProperty("User"),
						props.getProperty("Password")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection.get();
	}

	// connection properties
	private static Properties getPorperties() {
		Properties props = new Properties();
		props.put("Driver", "org.postgresql.Driver");
		props.put("Url", "jdbc:postgresql://localhost:5432/sbs");
		props.put("User", "sbs");
		props.put("Password", "sbs");
		return props;
	}
	
	// close is mandatory when connection is no longer needed
	public static void closeConnection() throws SQLException{
		getConnection().close();
	}
}
