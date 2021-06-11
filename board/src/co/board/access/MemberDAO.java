package co.board.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.board.model.Member;

public class MemberDAO {
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;
	String sql;

	// 연결
	public static void connect() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";

		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 닫기
	public static void close() {
		// connect를 닫는 메소드
		if (rs != null) { // 한번 사용했다면(데이터가 있다면, 널이 아니면)
			try {
				rs.close(); // 닫습니다.
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public String logIn(String id, String password) {
		String str = null;
		// 밑에서 만든 idEqual과 passEqual을 활용.
		if (idEqual(id)) {

			if (passEqual(password)) {
				str = "로그인 성공!";
			} else {
				str = "비밀번호가 틀렸습니다.";
			}
		} else {
			str = "아이디가 없습니다.";
		}
		return str;
	}

	public boolean idEqual(String id) {
		connect();
		boolean a = false;
		sql = "select u_id from member where u_id=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				a = true;
				return a;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}

		return a;
	}

	public boolean passEqual(String password) {
		connect();
		boolean a = false;
		sql = "select u_pass from member where u_pass=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, password);
			rs = psmt.executeQuery();

			if (rs.next()) {
				a = true;
				return a;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}

		return a;
	}

}
