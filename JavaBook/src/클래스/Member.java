package 클래스;

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

	@Override
	public boolean equals(Object obj) {
		Member m = ((Member)obj);
		return m.name == this.name && m.id == this.id;
	}
	
	

	
	
	
}
