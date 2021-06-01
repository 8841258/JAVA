package 상속;

public abstract class Animal {
	Animal () {}
	
	void run() {System.out.println("동물은 달린다.");}
	
	public abstract void eat();
	
	void sleep() {System.out.println("동물은 잔다.");}
	
	
}
