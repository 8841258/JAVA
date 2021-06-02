package pkg.inheritance;

public class MainApp {

	public static void main(String[] args) {
		A a = new D(); //자동 형변환
		
		int temp = ((D)a).sd; //강제 형변환
		
		A o = new A();
		int temp2 = ((D)o).sd; //런타임 오류
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof D);
		System.out.println(a instanceof X);
		
		
		

	}

}
