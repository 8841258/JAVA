package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.yedam.common.Person;

public class SqliteConnect {
	//필드
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;
	
	/*
	 * update 테이블명 set 변경할 칼럼=변경값 where 조건컬럼=조건값;
	 * delete from 테이블명 where 조건컬럼=조건값;
	 * insert into 테이블명 values(입력값1, 2, 3....)
	 */
	
	
	
	
	//1. 조회, 2. 입력, 3. 수정, 4. 삭제, 5. 전체리스트(각각 기능을 분리. 메소드로 기능분리)
	
	//전체조회
	public static ArrayList<Person> getPersonList() {
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
	
	
	//1건조회
	public static Person getPerson(int id) {
		connect();
		String sql = "select * from person where id = ?";
		Person p = null;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			rs = psmt.executeQuery(); // select에 사용
			
			if (rs.next()) {
				p = new Person();  //인스턴스 생성하고 변수 p에 대입
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				p.setPhone(rs.getString("phone"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return p;
	}
	
	//입력기능
	public static void insertPerson(int id, String name, int age, String phone) {
		connect();
		String sql = "insert into person values(?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id); // 숫자는 ?의 순서. 매개변수와는 상관이 없다.
			psmt.setString(2, name);
			psmt.setInt(3, age);
			psmt.setString(4, phone);
			
			int r = psmt.executeUpdate(); //insert, update, delete 할 때 사용.
			System.out.println(r + "건 입력되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		
	}
	
	
	//수정기능
	public static void personUpdate(Person p) {
		connect();
		
		String sql = "update person set name=?,age=?,phone=? where id = ?";
		
		try {
				psmt = conn.prepareStatement(sql); 
				psmt.setString(1, p.getName());
				psmt.setInt(2, p.getAge());
				psmt.setString(3, p.getPhone());
				psmt.setInt(4, p.getId());
				
				int r = psmt.executeUpdate(); 
				System.out.println(r + "건 수정되었습니다.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();   
		}
		
		
		
	}
	
	
	
	
	//삭제기능
	public static void personDelete(int id) {
		connect();
		String sql = "delete from person where id=?";

		
		try {
			//쿼리 실행
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			//결과 담기
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	
	
	//이름조회
	
	public static ArrayList<Person> personNameSelect(String name) {
		connect();
		ArrayList<Person> list = new ArrayList<>();
		Person person;
		//sql 담기
		String sql = "select * from person where name=?";
		
		try {
			//쿼리 실행
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			//쿼리 실행 결과(목록)를 rs 변수에 담음.
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				person = new Person();
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setPhone(rs.getString("phone"));
				list.add(person);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list; //검색된 리스트를 리턴한다.
	}
	
	
	
	
	
	// 1. 연결 객체를 만든다.
	public static void connect() {
		
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결 성공!");
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
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1:전체리스트 2:입력 3:수정 4:삭제 5:한건조회 6.이름조회 9:종료");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				
				//전체리스트 기능.
				System.out.println("조회 결과");
				ArrayList<Person> list = getPersonList();
				for (Person person : list) {
				System.out.println(person); 
				}
				
			} else if (menu == 2) {
				
				//입력
				System.out.println("아이디를 입력하세요.");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("나이를 입력하세요.");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("휴대폰 번호를 입력하세요.");
				String phone = sc.nextLine();
				
				insertPerson(id, name, age, phone);
				
			} else if (menu == 3) {
				//수정
				System.out.println("수정할 id를 입력하세요.");
				int id = sc.nextInt(); //이거 다음에
				sc.nextLine(); //이것***********************************
				Person p = getPerson(id);
				
				if (p == null) { //조회아이디가 존재하지 않음.
					System.out.println("존재하지 않는 id입니다.");
					continue;
				}

				System.out.println("변경할 이름을 입력하세요.");
				String name = sc.nextLine();
				
				System.out.println("변경할 나이를 입력하세요.");
				String age = sc.nextLine();
				
				System.out.println("변경할 휴대폰 번호를 입력하세요.");
				String phone = sc.nextLine();
				if (!name.equals("")) { //엔터로 넘어가는게 아니면, 즉 입력이 되면
					p.setName(name); //입력
				}
				if (!age.equals("")) { //엔터로 넘어가는게 아니면, 즉 입력이 되면
					p.setAge(Integer.parseInt(age)); //입력
				}
				if (!phone.equals("")) {
					p.setPhone(phone);
				}
				
				personUpdate(p);
				
				
			} else if (menu == 4) {
				//삭제
				System.out.println("삭제할 id를 입력하세요.");
				int id = sc.nextInt();
				personDelete(id);
				
			} else if (menu == 5) {
				
				//한건조회
				System.out.println("조회할 id를 입력하세요.");
				int id = sc.nextInt();
				Person p = getPerson(id);
				if (p == null) {
					System.out.println("조회된 데이터가 없습니다.");
				} else {
					System.out.println(p);
				}
				
			}  else if (menu == 6) {
				
				//이름조회
				System.out.println("조회할 이름을 입력하세요.");
				String name = sc.next();
				ArrayList<Person> p= personNameSelect(name);
				
				if (p.size() == 0) { 
					System.out.println("조회된 데이터가 없습니다..");

				}
				else {
					for (Person person : p) {
						System.out.println(p);
					}
				}

			} 
			else if (menu == 9) {
				break;
			}
			
			
			
		} //while문의 끝
		
		sc.close();
		
		System.out.println("정상적인 종료.");



		
	} //main 끝
} //class 끝
