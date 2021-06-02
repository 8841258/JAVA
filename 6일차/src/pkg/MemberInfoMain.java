package pkg;

public class MemberInfoMain {

	public static void main(String[] args) {
		MemberInfo memberInfo1 = MemberInfo.getInstance();
		memberInfo1.names[0] = "푸";
		
		
		MemberInfo memberInfo2 = MemberInfo.getInstance();
		memberInfo2.names[0] = "티거";
		
		
		MemberInfo memberInfo3 = MemberInfo.getInstance();
		memberInfo3.names[0] = "피글렛";
		
		memberInfo1.print();
		memberInfo2.print();
		memberInfo3.print();
	}

}
