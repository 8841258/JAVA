package pkg.friend;

import java.util.List;

public class FriendManager implements FriendAccess {
	Friend[] friends = new Friend[5];

	public FriendManager() {
		friends[0] = new CompanyFriend("디즈니회사", "푸", "010-1111-2222", "대표");
		friends[1] = new SchoolFriend("디즈니초등학교", "미키마우스", "010-2321-3323", "160101");
		friends[2] = new SchoolFriend("디즈니초등학교", "미니마우스", "010-2321-2443", "170321");
		friends[3] = new CompanyFriend("디즈니회사", "티거", "010-2324-3323", "비서");
		friends[4] = new SchoolFriend("디즈니초등학교", "도널드덕", "010-8768-3323", "151011");
	
	}
	
	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAll() {
		System.out.println("FriendManager 클래스입니다.");
		
	}

	@Override
	public Friend selectOne(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	}

