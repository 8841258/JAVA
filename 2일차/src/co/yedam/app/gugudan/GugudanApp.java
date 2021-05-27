package co.yedam.app.gugudan;

public class GugudanApp {

	//입력받은 단만 출력
	void printDan(int dan) {
		//2단 다 출력
			for (int j=1; j<10; j++) {
				System.out.print(dan + " * " + j + " = " + dan*j + "\t");
			}
			System.out.println("");
		}
		
	void printRange(int s, int e) {
		//s단부터 e단까지 출력
		for (;s<e+1;s++) {
			for (int i=1; i<10; i++) {
				System.out.print(s + " * " + i + " = " + s*i + "\t");
			}
		}
		System.out.println("");
	}
	
	void printAll() {
		//9단까지 모두 출력
		for (int j = 1; j<10; j++) {
			for (int i=1; i<10; i++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
		}
		System.out.println("");
	}
	
	void printAllReverse() {
		//9단부터 거꾸로 출력
		for (int j=9; j>0; j--) {
			for (int i=9; i>0; i--) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
		}
	}
	

}
