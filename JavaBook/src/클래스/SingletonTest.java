package 클래스;

public class SingletonTest {

	public static void main(String[] args) {
		Calculator cal1 = Calculator.getInstance();
		cal1.add(4, 5);
		
		// Calculator c2 = new Calculator(); 생성자 private로 막았으니까 안됨.

		Calculator cal2 = Calculator.getInstance();
		cal2.add(4, 5);
		
		System.out.println(cal1 == cal2);
	}

}
