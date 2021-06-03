package pkg.friend;

import java.util.List;

//친구 관리 개발시 개발 표준
public interface FriendAccess {
	
	//등록
	public void insert(Friend friend); // 추상 메서드. public abstract 생략됨.
	
	
	//수정
	public void update(int idx, Friend friend);
	
	
	//삭제
	public void delete(String name);
	
	
	//전체조회
	public void selectAll();
	
	
	//단건조회
	public Friend selectOne(String name);
	
	
	
}
