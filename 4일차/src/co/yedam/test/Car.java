package co.yedam.test;

/* 자동차 정보 */

//1 클래스 선언
public class Car {
	//필드 (상태, 속성...)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자 : 객체 생성시에 호출되어서 필드 초기화를 하는 특수 용도의 메서드.
	//생성자 이름은 클래스명과 동일.
	//리턴타입 없음.
	//생성자 여러개 중복선언(오버로딩)은 가능하지만, 매개변수의 타입과 개수는 달라야 한다.
	//변수 이름 다른거는 에러남.
	
	Car() {
		
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}


	Car (String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

	public Car(String model, int speed) {
		this(null, model, null, 0, speed);
	}

	public Car(String company, String model, String color, int maxSpeed, int speed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		if (maxSpeed > 100) {
			this.maxSpeed = maxSpeed;
		} else {
			this.maxSpeed = 100;
		}
		if (speed > 50) {
			this.speed = speed;
		} else {
			this.speed = 50;
		}
	}

}
