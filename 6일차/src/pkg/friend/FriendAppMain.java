package pkg.friend;

public class FriendAppMain {

	public static void main(String[] args) {
		FriendList list = new FriendList();
		//등록
		Friend f = new CompanyFriend("디즈니회사", "푸", "010-2323-4545");
		list.insert(f);
		f = new SchoolFriend("디즈니학교", "미키", "010-2526-4765");
		list.insert(f);
		
		//검색
		System.out.println(list.selectOne("푸"));
		
		
		//수정
		f = new SchoolFriend("디즈니학교", "미키", "010-2526-4765");
		list.update(f);

		
		//삭제
		list.delete("푸");
		
		
		
		//전체조회
		list.selectAll();
	}

}
