package pkg.other;

import pkg.Car;
import pkg.Count;
import pkg.DateUtil;
import pkg.Projectinfo;


public class AppMain {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setModel("현대");
		car.setSpeed(-50);
		System.out.println(car.getModel());
		System.out.println(car.getSpeed());
		
		Car car2 = new Car("삼성", 40);
		System.out.println(car2.getModel());
		System.out.println(car2.getSpeed());
		
		Car car3 = new Car("현대");
		System.out.println(car3.getModel());
		System.out.println(car3.getSpeed());
		
		
		
		System.out.println(DateUtil.curDate());
		System.out.println(Projectinfo.name);
		
		Count count1 = new Count();
		Count.cnt1++;
		count1.setCnt2( count1.getCnt2() + 1);
		
	}
}
