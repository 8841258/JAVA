package co.yedam.app;

import java.util.Scanner;

/*
 * 형 변환
 * 정수형 : byte < short < int   < long
 * 실수형 :                float < double
 * 
 * 스트링 <------> byte    Byte.parseByte(변수)
 *              short    Short.pharseShort(변수)
 *              int      Integer.parseInt
 *              long     
 *              float
 *              double
 *              char
 *              boolean
 */



public class CastTest {

	public static void main(String[] args) {
		// 자동형변환
		int a= 10;
		long b = a;
		
		// 강제형변환
		a = (int)b;
		
		//char(문자) <-> int(코드)
		char c = 'Z';
		System.out.println((int)c);
		
		int d = 97;
		System.out.println((char)d);
		
		// 실수(double) -> 정수(int)
		double e = 10.5;
		long f = (long)e;
		System.out.println(f);
		
		// 수식 내에서 자동으로 형변환
		double g = 5 + 10.5;
		String h = "hi" + 5;
		System.out.println(h);
		
		//정수끼리의 연산결과는 정수, 하나를 실수로 만들어주면 알아서 실수로 계산
		double i = 5 / (double)2;
		System.out.println(i);
		
		// 스트링 -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		
		// int -> 스트링
		String s2 = String.valueOf(j);
		
		Scanner scanner = new Scanner(System.in);
		String greet = scanner.next();
		
		System.out.println(greet);
		
	}

}
