package 도형;

public class Tri extends Shape implements Drawable {
	
	//필드
	int h;
	
	//생성자
	Tri(int w, int h) {
		super(w); //this.w = w;
		this.h = h;
	}
	
	//메서드
	@Override
	public void area() {
		result = w * h / 2;
	}
	
	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	
}
