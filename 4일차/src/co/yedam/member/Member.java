package co.yedam.member;

public class Member {
	String id;
	String name;
	String password;
	int age;
	
	Member () {}
	
	Member (String id, String name, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	
	
	
}
