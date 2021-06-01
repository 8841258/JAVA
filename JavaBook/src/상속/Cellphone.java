package 상속;

public class Cellphone {
	String model;
	String color;
	
	public Cellphone() {
		System.out.println("Cellphone 기본생성자");
	}
	
	public Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Cellphone 생성자");
	}
	
	
	
	
	void powerOn() {
		System.out.println(model + "폰 " + color + "색상 전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
}
