package 상속;

public class Human extends Animal {
	Human() {}
	
	void think() {
		System.out.println("인간은 생각한다.");
	}

	@Override
	public void eat() {
		System.out.println("인간은 고기/채소를 먹는다.");
		
	}
	
	
	
}
