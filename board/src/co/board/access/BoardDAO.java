package co.board.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.board.model.Board;

public class BoardDAO implements BoardAccess {
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;
	String sql;
	
	//연결
	public static void connect() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		} 	
	}
	
	//닫기
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
	
	
	
	
	@Override
	public ArrayList<Board> selectList() {
		ArrayList<Board> array = new ArrayList<>();
		connect();
		
		sql = "select * from board where b_parent_id is null";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				
				Board b = new Board();
				b.setId(rs.getInt("b_id"));
				b.setTitle(rs.getString("b_title"));
				b.setWriter(rs.getString("b_writer"));
				b.setContent(rs.getString("b_content"));
				array.add(b);
				
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		

		return array;
	}

	
	
	@Override
	public void insert(Board board) {
		connect();
		sql = "insert into board (b_title, b_content, b_writer) values(?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			// ? 에 세팅할 값.
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 등록 완료.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	

	@Override
	public void update(Board board) {
		connect();
		
		sql = "update board set b_title=?, b_writer=?, b_content=? where b_id=?";
		
		try {

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			psmt.setInt(4, board.getId());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 수정 완료.");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}
	
	
	//수정할 때, 입력할 글 번호가 데이터베이스에 없으면 없는 번호라고 BoardApp에 표시하기 위해
	//글 번호가 있으면 true, 없으면 false를 호출하는 메소드
	public boolean checkId(int num) {
		connect();
		sql = "select * from board where b_id=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	

	
	@Override
	public void delete(int id) {
		connect();
		
		sql = "delete from board where b_id=?";
		
		
		try {
			psmt = conn.prepareStatement(sql);
			
			//?에 조건 주기
			psmt.setInt(1, id);
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 삭제 완료.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}

	@Override
	public Board oneList(int id) {
		connect();
		Board b=null;
		sql = "select * from board where b_id=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, id);
			rs = psmt.executeQuery();

			b = new Board();

			b.setId(id);
			b.setTitle(rs.getString("b_title"));
			b.setWriter(rs.getString("b_writer"));
			b.setContent(rs.getString("b_content"));
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return b;
	}
	

	public void commentInsert(int contentNum, String comment) {
		connect();
		sql = "insert into board (b_title, b_content, b_writer, b_parent_id) values(?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "아무거나");
			psmt.setString(2, comment);
			psmt.setString(3, "아무거나");
			psmt.setInt(4, contentNum);
			
			int r = psmt.executeUpdate();

			System.out.println("댓글 " + r + "건 등록 완료.");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	
	public void selectComment(int num) {
		ArrayList<Board> array = new ArrayList<>();
		connect();
		
		sql = "select * from board where b_parent_id = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			
			rs = psmt.executeQuery();
			
			if (rs.next() == false) {
				System.err.println("없는 번호입니다.");
				System.out.println(); // 줄바꿈
			}
			else {
			while (rs.next()) {
				
				Board b = new Board();
				b.setId(num);
				b.setTitle(rs.getString("b_title"));
				b.setWriter(rs.getString("b_writer"));
				b.setContent(rs.getString("b_content"));
				array.add(b);
			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		for (Board b : array) {
			System.out.println("글 번호 : " + b.getId() + " | 댓글 내용 : " + b.getContent());
		}
		
	}
	
	
	//글이 삭제되면 코멘트도 같이 삭제되는 기능 넣으려다 실패
//	public void deleteComment(int num) {
//		
//		sql = "select * from board where b_parent_id = ?";
//		String sql2 = "delete from board where b_parent_id=?";
//		
//
//		
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, num);
//			
//			rs = psmt.executeQuery();
//			
//
//				if (rs.next()) {
//					PreparedStatement psmt2 = conn.prepareStatement(sql2);
//					psmt2.setInt(1, num);
//					int rr = psmt.executeUpdate();
//					System.out.println("게시글에 달린 " + rr + "건의 댓글도 삭제 완료.");
//				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		
//	}
	
	
	
	
	

}
