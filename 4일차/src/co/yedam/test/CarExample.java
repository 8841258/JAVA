package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		//2 객체 생성(인스턴스)
		Car myCar2 = new Car();
		System.out.println("제작회사:"+myCar2.company);
		System.out.println("모델:"+myCar2.model);
		System.out.println("색상:"+myCar2.color);
		System.out.println("속도:"+myCar2.maxSpeed);
		System.out.println(myCar2);
		
		Car myCar = new Car("현대자동차", "그랜저", "검정", 360);
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델:"+myCar.model);
		System.out.println("색상:"+myCar.color);
		System.out.println("속도:"+myCar.maxSpeed);
		System.out.println(myCar);
		
		Car miniCar = new Car("코나", 40);
		System.out.println(miniCar.model);
		System.out.println(miniCar.speed);
		System.out.println(miniCar);
	}

}
