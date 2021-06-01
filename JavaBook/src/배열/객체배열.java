package 배열;

import java.awt.Point;

/*
 * 객체 배열 : 배열의 요소 타입이 객체인 경우
 */

public class 객체배열 {
	public static void main(String[] args) {
	//변수를 선언
	Score[] a;
	a = new Score[10];
	a[0] = new Score("pooh", 70, 50, 60);
	a[1] = new Score("tiger", 30, 30, 40);
	a[2] = new Score("piglet", 40, 50, 60);
	
	
	//이름만 출력
	for (int i=0; i<a.length; i++) {
		if (a[i] != null) {
			System.out.println(a[i].name);
		}
	}
	
	//선언과 동시에 초기화
	Score[] b = {new Score("pooh", 70, 50, 60),
				new Score("tiger", 30, 30, 40),
				new Score("piglet", 40, 50, 60)};
	
	//이름과 총점을 출력, 단 if를 넣을 필요는 없다. 이미 길이가 3이라고 만들었기 때문.
	//위에서는 길이를 10이라고 정해줘서 null값이 생긴 것이다.
	System.out.println("이름 : 총점");
	for (Score score : b) {
		System.out.println(score.name + ":" + score.total);
		}
	
		//객체 배열
		Point[] c = {new Point(10, 10),
					new Point(30, 10),
					new Point(10, 30),
					new Point(30,30)};
		
		for (Point point : c) {
			System.out.println(point.x + ":" + point.y);
		}
	
	
	
	
	
	
	
	
	
	}

}
	

