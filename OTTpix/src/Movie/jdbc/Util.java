package Movie.jdbc;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.cj.jdbc.Driver;
public class Util {
private static Properties properties= new Properties();
static {
	try(InputStream stream=Util.class.getClassLoader().getResourceAsStream("app.properties")){
		properties.load(stream);
	}catch(IOException e) {
		System.out.println("app.properties config file not found");
	}
	
}
public static Connection getConnection() {
	String driver=properties.getProperty("db.driver");
	String url=properties.getProperty("db.url");
	String user=properties.getProperty("db.user");
	String password=properties.getProperty("db.password");
	Connection connection =null;
	try {
		Class.forName(driver);
		connection=DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException|SQLException e) {
		System.out.println(e.getMessage());
	}
	return connection;
}
public static void displayMessage(SQLException e) {
	System.out.println();
}
}
