package com.sunny.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/sunny?useSSL=false";
		String user= "root";
		String pass= "sunnykumar@12";
		try {
			System.out.println("connection to DB" + jdbcUrl);
			Connection myconn=DriverManager.getConnection(jdbcUrl ,user , pass);
			System.out.println("connected success");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
