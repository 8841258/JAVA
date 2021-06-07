package 연산자;

public class 관계연산 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		
		if ( y++ > 10 && x++ > 10) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
		//11이 되어야 하는데 왜 10이 나오지?
		// -> y++ > 10이 false라서 뒤의 연산을 하지 않은 것. 하나라도 false면 false니까.
		// (++y > 10 || x++ > 10)도 y=11, x=10. or연산에서는 앞만 중요
		System.out.println(x);
		
		System.out.println(y);
		
		
		//시프트 연산 - 곱하기 나누기 대신에 많이 쓰임. 속도가 훨씬 빠름.
		int f = 8;
		System.out.println(f >> 1);   //1000  ->  0100     나누기 2 한것과 같은 결과. 속도가 시프트 연산이 더 빠름.
		System.out.println(f << 2);   
		

	}

}
