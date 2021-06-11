package co.memo.access;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.memo.model.Memo;
import co.memo.util.DAO;

public class MemoDAO extends DAO implements MemoAccess{
	
	ArrayList<Memo> memo = new ArrayList<>();
	
	String sql;
	PreparedStatement psmt;
	ResultSet rs;
	

	@Override
	public void insert(Memo memo) {
		sql = "insert into memo values(?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, memo.getDate());
			psmt.setString(2, memo.getContent());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 등록 완료.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Memo memo) {
		
		sql = "update memo set content=? where date=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, memo.getContent());
			psmt.setString(2, memo.getDate());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 수정 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete(String date) {
		sql = "delete from memo where date=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, date);
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 삭제 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<Memo> selectAll() {
		ArrayList<Memo> array = new ArrayList<>();
		sql = "select * from memo";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
			Memo memo = new Memo();
			memo.setDate(rs.getString("date"));
			memo.setContent(rs.getString("content"));
			array.add(memo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array;
	}

	@Override
	public ArrayList<Memo> selectDate(String date) {
		ArrayList<Memo> memo = new ArrayList<>();
		
		sql = "select * from memo where date=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, date);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				Memo m = new Memo();
				m.setDate(rs.getString("date"));
				m.setContent(rs.getString("content"));
				memo.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return memo;
	}

	
	
	@Override
	public ArrayList<Memo> selectContent(String Content) {
		ArrayList<Memo> memo = new ArrayList<>();
		
		sql = "select * from memo where content like '%어제%'";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			
			psmt.setString(1, Content);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
			Memo memoo = new Memo();
			memoo.setDate(rs.getString("date"));
			memoo.setContent(rs.getString("content"));
			memo.add(memoo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return memo;
	}

}
