package 도형;

public class AppMain {

	public static void main(String[] args) {
		/* Circle circle = new Circle(5); //원의 넓이
		circle.area();
		circle.print();
		circle.draw();
		Rect rect = new Rect(8, 10); // 사각형의 넓이
		rect.area();
		rect.print();
		rect.draw();
		rect.move();
		Tri tri = new Tri(12, 30); //삼각형의 넓이
		tri.area();
		tri.print();
		tri.draw(); */
		
		//다형성
		Shape s = new Rect(4,5); //부모s변수가 자식Rect를 참조하고 있음.
		s.area();
		s.print();
		
		s = new Tri(4,5); //부모s변수가 자식Tri를 참조하고 있음.
		s.area();
		s.print();
		
		
		//배열로 만들었을때.
		Shape[] h = new Shape[3];
		h[0] = new Rect(4,5);
		h[1] = new Circle(5);
		h[2] = new Tri(4,5);
		
		for (Shape temp : h) {
			temp.area();
			temp.print();
		}
		
		Drawable[] a = new Drawable[3];
		a[0] = new Rect(4,5);
		a[1] = new Circle(5);
		a[2] = new Tri(4,5);
		
		
		for (Drawable tempp : a) {
			tempp.draw();
			if (tempp instanceof Rect) {
				((Rect)tempp).area();
				((Rect)tempp).print();
			}
			else if (tempp instanceof Circle) {
				((Circle)tempp).area();
				((Circle)tempp).print();
			}
			else if (tempp instanceof Tri) {
				((Tri)tempp).area();
				((Tri)tempp).print();
			}
//			if (tempp instanceof Shape) {
//				((Shape)temp).area();
//			}    위에 세개를 이 하나로도 가능.
			
			
			
			if (tempp instanceof Movable) {
				((Movable)tempp).move();
			}
		}
		
		
		}

	}


