package 도형;

public class Rect extends Shape implements Drawable, Movable {
	//필드
	int h;
	
	//생성자
	Rect(int w, int h) {
		super(w); //this.w = w;
		this.h = h;
	}
	
	//메서드
	@Override
	public void area() {
		result = w * h;
	}
	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
	@Override
	public void move() {
		System.out.println("사각형을 옮깁니다.");
	}
}
