package co.yedam.app;
/*
 * 연산자 테스트
 * 논리 :
 */
public class OperaterTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;
		int result2 = y++ + 10 ;
		System.out.println(x + " " + result1);
		System.out.println(String.format("x=%d 결과=%d", x, result1));
		System.out.println(y + " " + result2);
		System.out.println(String.format("x=%d 결과=%d", y, result2));
		
		System.out.println(x>0 && y>0);
		System.out.println(!(x==0) || ! (y==0) );
		

		System.out.println( x>=0 && y>=0 ? "둘다 양수" : "아님");
		x = 3;
		System.out.println( x%2 ==0 ? "짝수" : "홀수");
		
		
	}
}
