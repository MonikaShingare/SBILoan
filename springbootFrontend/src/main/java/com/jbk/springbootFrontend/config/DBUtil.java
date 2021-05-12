package com.jbk.springbootFrontend.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
private static Connection connection;
public static Connection getConnection()
{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "root");
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return connection;
}

}
