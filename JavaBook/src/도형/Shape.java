package 도형;

public abstract class Shape {
	//필드
	int w;
	double result;
	
	//생성자
	Shape() {} //기본 생성자
	Shape(int w) {
		this.w = w; //명시적 생성자
	}
	
	//메서드(추상 클래스는 추상 메서드/메서드 둘다 쓸수있음.)
	public void print() {
		System.out.println("면적=" + result);
	}
	
	//추상 메서드 (Body가 없고, 자식 클래스에서 반드시 재정의해야한다.)
	public abstract void area();
	
	
}
