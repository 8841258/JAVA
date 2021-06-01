package co.micol.tv;

public class SamsungTV implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("삼성 TV 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("삼성 TV 전원을 끕니다.");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("삼성 TV 볼륨을 올립니다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성 TV 볼륨을 내립니다.");
		
	}
	
}
