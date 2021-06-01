package 클래스;


//클래스 선언
public class Robot {

	//필드
	private int arm; //private : 클래스 내부에서만 접근 가능
	private int leg;
	private String name;
	
	public Robot() {}
	
	public Robot (int arm, int leg) {
		this.arm = arm;
		this.leg = leg;
	}
	
	public Robot(String name) {
		super();
		this.name = name;
	}

	
	
	
	//setter : 필드값을 변경
	public void setArm(int arm) {
		this.arm=arm;
	}
	
	
	//getter : 필드값을 조회
	public int getArm() {
		return this.arm;
	}
	
	public int getLeg() {
		return this.leg;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	
	
	//일반 메서드
	

	void print() {
		System.out.printf("arm : %d, leg : %d", arm, leg);
	}
	
	
	
}
