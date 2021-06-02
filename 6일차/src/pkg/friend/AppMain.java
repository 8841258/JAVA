package pkg.friend;


public class AppMain {
	public static void main(String[] args) {
		//Friend f = new CompanyFriend("학교", "홍길동", "1111", "과장");
		//f.print();
		//Friend f2 = new SchoolFriend("디즈니학교", "미키마우스", "010-222-2222", "150324");
		//f2.print();
		
		
		
		//다형성 (상속 오버라이딩해야만 가능)
		//부모 타입의 참조변수가 자식 객체를 참조할 수 있다.
		//메서드 실행하면 참조대상의 메서드가 호출되므로 결과가 다르다.
		
		FriendManager manager = new FriendManager();
		
		for ( Friend fr : manager.friends ) {
			if (fr instanceof CompanyFriend ) {
				fr.print();
			
			}
			}
			
		}
		
		
		
	}

