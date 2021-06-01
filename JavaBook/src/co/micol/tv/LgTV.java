package co.micol.tv;

public class LgTV implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG TV 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV 전원을 끕니다.");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV 볼륨을 올립니다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV 볼륨을 내립니다.");
		
	}
	
}
