package 상속;

public class DmbCellphone extends Cellphone {
	int channel;
	
	public DmbCellphone() {
		System.out.println("DmbCellphone 기본생성자");
	}
	
	
	public DmbCellphone(String model, String color, int channel) {
		this.channel = channel;
		System.out.println("DmbCellphone 생성자");
	}
	
	void turnOnDmb () {
		System.out.printf("채널 %d번 DMB 방송수신 시작", channel);
		System.out.println();
	}
	
	void turnOffDmb () {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	void ChangeChannel(int channel) {
		this.channel = channel;
		System.out.printf("%d 으로 채널 변경", channel);
		System.out.println();
		
	}


	@Override //재정의 : 상속받은 메서드를 수정. //오버로딩(중복정의)
	void powerOn() {
		//super.powerOn();
		System.out.println("dmb 전원 on");
	}
}
