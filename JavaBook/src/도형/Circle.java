package 도형;

public class Circle extends Shape implements Drawable {
	
	//생성자
	Circle(int w) {
		super(w); //this.w = w;
	}
	
	
	//메서드, 오버라이딩(재정의)됨.
	@Override
	public void area() {
		result = w * w * 3.14;
	}
	
	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	
	
}
