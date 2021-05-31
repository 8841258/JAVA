package co.yedam.test;

import java.util.Arrays;

/*기본 데이터형 8가지*
 * 기본 데이터형 8타입(byte, short, int, long, float, double, char)
 * 
 */

public class FieldInitValue {

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	String Stri;
	int[] arr;
	
	FieldInitValue() {} //명시적 생성자를 만들었다면 기본 생성자도 만들어 주는 것이 좋음.
	
	FieldInitValue (int i, double d) {
		this.i = i;
		this.d = d;
	}
	
	
	@Override
	public String toString() {
		return "FieldInitValue [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", c=" + c
				+ ", bool=" + bool + ", Stri=" + Stri + ", arr=" + Arrays.toString(arr) + "]";
	}
	
}
