package com.omkar.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class JDBCUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private JDBCUtil() {}
	private static Connection connection = null;
	
	public static Connection getConnection() throws IOException, SQLException {
		if(connection != null) return connection;
		File file = new File("src/main/java/com/omkar/properties/application.properties");
		System.out.println(file.getAbsolutePath());
		FileInputStream fis= new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),
				properties.getProperty("password"));
		return connection;
	}
	public static void cleanUp(Connection connection,Statement statement,ResultSet resultSet) throws SQLException {
		if (resultSet != null) {
			resultSet.close();
		}
		if(statement!=null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}

}
