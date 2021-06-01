package 상속;

public class Superman extends Human implements Flyer {
	Superman() {}
	
	@Override
	public void takeOff() {System.out.println("슈퍼맨은 이륙한다.");}
	@Override
	public void fly() {System.out.println("슈퍼맨은 날아다닌다.");}
	@Override
	public void land() {System.out.println("슈퍼맨은 착륙한다.");}
	
	
}
