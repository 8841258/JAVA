package co.yedam;

/* 
 * 클래스 선언 -> new 클래스 생성 -> 필드나 메서드 호출 실행
 * 1. 클래스 선언
 * class 이름 {      }
 */


public class Student {
 //필드 + 메서드. 필드만 있을수도, 메서드만 있을수도, 아무것도 없을 수도 있다.
	String name;
	String no;
	void print () {
		System.out.println(no+":"+ name);
	}
}
