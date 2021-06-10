package com.yedam.lambda;

@FunctionalInterface
interface Run {
	void run();
}

class RunCls implements Run {

	@Override
	public void run() {
		System.out.println("달립니다.");
	}
	
}

public class FunctionalEx1 {

	public static void main(String[] args) {
		
		Run rr = new RunCls();
		rr.run();
		
		Run r = () -> System.out.println("빨리 달립니다."); //consumer 타입
		r.run();
			
	}

}
