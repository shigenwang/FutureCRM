package com.future.hist.crm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurecrm", "root","root"); 
				Statement statement = connection.createStatement();

		)

		{
			String sql = "select * from city";
//			String sql = "insert into city values()";
			ResultSet execute= statement.executeQuery(sql);
			System.out.println(execute.next());

		}
	}
}