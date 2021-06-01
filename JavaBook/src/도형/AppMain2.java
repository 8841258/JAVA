package 도형;

public class AppMain2 {

	public static void main(String[] args) {
		Shape s1 = new Rect(4,5); //부모 타입은 자식 객체 참조 가능. 자동 형변환
		execute(s1);
		
		Shape s2 = new Circle(4);
		execute(s2);
		
	}
	
		public static void execute(Shape s) {
			if (s instanceof Drawable) {
				((Drawable)s).draw();
			}
			else if (s instanceof Movable) {
				((Movable)s).move();
			}
			s.area();
		}

	}


