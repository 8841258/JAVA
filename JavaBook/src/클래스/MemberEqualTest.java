package 클래스;

public class MemberEqualTest {

	public static void main(String[] args) {
		Member m1 = new Member("grr", "푸", "9393", 5);
		Member m2 = new Member(new String("grr"), "푸", "9662", 10);

		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		
		
		
	}

}
