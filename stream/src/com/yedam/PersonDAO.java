package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAO {
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;

	
	public static void connect() {
		
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
	}
	
public static void connectChinook() {
		
		String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
		
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Chinook DB 연결 성공.");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
	}
	
	
	public static void close() {
		//connect를 닫는 메소드
		if (rs != null) { //한번 사용했다면(데이터가 있다면, 널이 아니면)
			try {
				rs.close(); //닫습니다.
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
	
	public ArrayList<Person> getPersonList() {
		ArrayList<Person> personList = new ArrayList<>();
		connect();
		String sql = "select * from person";
		Person person;
		try {
			psmt = conn.prepareStatement(sql); //PreparedStatement 쿼리를 실행.
			rs = psmt.executeQuery(); //쿼리 실행 결과 가져오는 부분
			

			while (rs.next()) {
				person = new Person();
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setPhone(rs.getString("phone"));
				personList.add(person);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //성공을 했건, 실패를 했건 무조건 실행이 되는 부분.
			close(); //닫는다. (밑에 메소드 만듬)
		}
		return personList;
	}
	
	
	public ArrayList<Employee> getList() {
		connectChinook();
		ArrayList<Employee> employee = new ArrayList<>();
		String sql = "select * from employees";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
			Employee e = new Employee();
			e.setFirstDame(rs.getString("firstname"));
			e.setTitle(rs.getString("title"));
			e.setBirthDate(rs.getString("birthdate"));
			employee.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}
	
	
	
	
}
