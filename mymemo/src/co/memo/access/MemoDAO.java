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
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Memo memo) {
		sql = "update memo set ";
		
	}

	@Override
	public void delete(String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Memo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Memo selectDate(String Date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Memo selectContent(String Content) {
		// TODO Auto-generated method stub
		return null;
	}

}
