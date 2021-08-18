package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMng {
		private static Connection conn = null;
		
		private DBMng() {
		}	
		/*
		 *  DBMS 커넥션 반환하는 메서드
		 *  
		 *  @return java.sql.Connection
		 *  @return SQLException : DBMS에 문제가 생겼을 때
		 */
		
		
			public static Connection getConnection() throws SQLException {
				if(conn == null) {
					try {
						Class.forName("org.mariadb.jdbc.Driver");
						
						conn = DriverManager.getConnection("jdbc:mariadb://localhost::3307/webmarketdb?user=root&password=koreait");
					} catch(ClassNotFoundException | SQLException e) {
						e.printStackTrace();
					} // end try
				} // end if				
				return conn;
			}
		}

