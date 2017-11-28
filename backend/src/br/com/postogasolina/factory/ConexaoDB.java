package br.com.postogasolina.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {


	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/postgas_db";
			String username = "root";
			String password = "root";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {
			System.out.println(e);

		}
		return null;
	}

}
