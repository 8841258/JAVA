package co.memo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	protected Connection conn;

	//생성자. 상속한다면 무조건 이것이 실행될 것이다.
	protected DAO() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
