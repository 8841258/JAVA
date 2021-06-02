package pkg.friend;

import java.util.List;

//친구 관리 개발시 개발 표준
public interface FriendAccess {
	String model = "현대"; //상수 필드. 일반 필드 아님~ static final 생략되어 있음.
	
	//등록
	public void insert(Friend friend); // 추상 메서드. public abstract 생략됨.
	
	
	//수정
	public void update(Friend friend);
	
	
	//삭제
	public void delete(String name);
	
	
	//전체조회
	public void selectAll();
	
	
	//단건조회
	public Friend selectOne(String name);
	
	
	
}
