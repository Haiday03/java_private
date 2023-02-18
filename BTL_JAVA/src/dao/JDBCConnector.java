package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
	public static Connection getJDBCConnection() {
		final String user = "sa";
		final String password = "123456";
		
		final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCnhahang;user=" + user + ";password=" + password;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			return DriverManager.getConnection(url);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	public static void main(String[] args) {
//		Connection connection = getJDBCConnection();
//		if (connection != null) {
//			System.out.println("ket noi thanh cong nhe");
//		}else {
//			System.out.println("ket noi khong thanh cong");
//		}
//	}
}
