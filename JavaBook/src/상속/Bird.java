package 상속;

public class Bird extends Animal implements Flyer {
	Bird() {}

	@Override
	void run() {
		System.out.println("종종거리며 걷는다.");
	}

	@Override
	public void eat() {
		System.out.println("주로 벌레를 먹는다.");
	}
	@Override
	public void takeOff() {
		System.out.println("새는 이륙한다.");
		}
	@Override
	public void fly() {
		System.out.println("새는 날아다닌다.");
		}
	@Override
	public void land() {
		System.out.println("새는 착륙한다.");
		}

	
	void layEggs() {System.out.println("새는 알을 낳는다.");}
	
	
	
}
