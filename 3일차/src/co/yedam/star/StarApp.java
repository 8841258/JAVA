package co.yedam.star;

public class StarApp {
		//삼각형 출력
	void draw(int cnt) {
		for (int i=1; i<cnt; i++) {
			System.out.println(pad('*', i));
		}
	}
		//역삼각형
	void drawInvert(int cnt) {
		for (int i=cnt; i>0; i--) {
			System.out.println(pad('*', i));
		}
	}
		//이등변삼각형
	void drawEq(int cnt) {
		for (int i=1; i<cnt; i++) {
			System.out.print(pad(' ', cnt-i));
			System.out.println(pad('*', (i-1)*2+1));
		}
		}
			
		//트리 출력
	void drawEq(int num1, int num2) {
		for (int i=num1; i<num2; i++) {
			System.out.print(pad(' ', cnt-i));
			System.out.println(pad('*', (i-1)*2+1));
		}
		}
			 
	

		
	
	
	
	String pad(char a, int b) {
		String result = "";
		for (int i=0; i<b; i++) {
			result += a;
		}
		return result;
	}
	
	
}
