package co.yedam.app;
/*
 * 계산 게임
 * 사칙연산, 진수변환, 문자값 검사
 */

import java.util.Scanner;

public class CalcGame {
	
	double a;
	double b;
	
	void input() {
		CalcGame game = new CalcGame();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 :");
		String s1 = scanner.next();
		System.out.println("입력 : ");
		String s2 = scanner.next();
		
		a = Double.parseDouble(s1);
		b = Double.parseDouble(s2);
	}
	//정수값 두 수의 합을 계산 메서드(함수)
	double add() {
		return a+b;
	}
	//두 수의 몫을 계산 
	int rest() {
		return (int)a/(int)b;
	}
	//두 수의 나눗셈
	double divv() {
		return a/b;
	}
	//두 수의 나머지 연산
	int share() {
		return (int)a%(int)b;
	}
}