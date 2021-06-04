package co.friend.access;

import java.util.ArrayList;

import co.friend.model.Friend;

//친구 관리 개발시 개발 표준
public interface FriendAccess {
	
	//등록
	public void insert(Friend friend); // 추상 메서드. public abstract 생략됨.
	
	
	//수정
	public void update(Friend friend);
	
	
	//삭제
	public void delete(String name);
	
	
	//전체조회
	public ArrayList<Friend> selectAll();
		
	
	//단건조회
	public Friend selectOne(String name);
	
	
	public Friend findTel(String tel);
	
	
}
