package co.yedam.test;

public class CalcExample {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.turnOn();
		calc.sum1(10, 20);
		calc.sum1(10.5, 20.5);
		System.out.println(calc.sum2(100, 200));
		System.out.println(calc.sum3(10, 20, 30, 40, 50));
		calc.sum1(10000000, 999999999);
	}

}
