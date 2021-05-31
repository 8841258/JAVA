package co.yedam.test;



public class Calc {
	//on
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	 
	//sum
	void sum1(int num1, int num2) {
		System.out.println("int 메서드");
		System.out.println("두 수의 합 : " + (num1+num2));
	}
	
	void sum1(double num1, double num2) {
		System.out.println("double 메서드");
		System.out.println("두 수의 합 : " + (num1+num2));
	}
	
	int sum2(int num1, int num2) {
		return num1 + num2;
	}
	
	int sum3(int ... arr) {
		int result = 0;
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	
	
}
