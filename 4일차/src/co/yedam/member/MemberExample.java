package co.yedam.member;

public class MemberExample {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.name = "최하얀";
		member1.age = 23;
		System.out.println(member1);
		
		Member member2 = new Member(null, null, null, 0);
		System.out.println(member2);
	}

}
