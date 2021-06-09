package co.friend.access;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import co.friend.model.Friend;
import co.friend.util.DAO;

public class FriendDAO extends DAO implements FriendAccess {
	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	
	@Override
	public void insert(Friend friend) {
		sql = "insert into friend values(?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, friend.getGubun());
			psmt.setString(2, friend.getName());
			psmt.setString(3, friend.getTel());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 등록되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void update(Friend friend) {
		sql = "update friend set tel=? where name=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, friend.getTel());
			psmt.setString(2, friend.getName());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 수정되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void delete(String name) {
		sql = "delete from friend where name=?";
		
		try {
			psmt = conn.prepareStatement(sql);

			
			psmt.setString(1, name);
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 삭제되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<Friend> selectAll() {
		System.out.println("전체조회2");
		ArrayList<Friend> friend = new ArrayList<Friend>();
		sql = "select * from friend";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				Friend f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
				friend.add(f);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return friend;
	}

	@Override
	public Friend selectOne(String name) {
		Friend f = new Friend();
		sql = "select * from friend where name=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
			}
			else {
				System.out.println("검색된 결과가 없습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f;
	}


	@Override
	public Friend findTel(String tel) {
		Friend f=null;
		sql = "select * from friend where tel=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tel);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
			}
			else {
				System.out.println("검색된 결과가 없습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f;
	}
	
	public Map<String, String> getNameTel() {
		Map<String, String> m = new HashMap<>();
		
		sql = "select name, tel from friend";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			
			while (rs.next()) {
				m.put(rs.getString("name"), rs.getString("tel"));
			}	
			
			
			//key값과 value값을 entryset에 담는다.
			Set<Entry<String, String>> ent = m.entrySet();
			
			//entryset을 iterator로 반복한다.
			Iterator<Entry<String, String>> eiter = ent.iterator();
			
			while (eiter.hasNext()) {
				Entry<String, String> e = eiter.next();
				System.out.println(e.getKey() + ", " + e.getValue());
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return m;
	}
	

	
	
	
	
	
}
