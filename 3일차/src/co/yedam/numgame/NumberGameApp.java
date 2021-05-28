package co.yedam.numgame;

/*
 * 숫자 맞추기 게임
 * 작성자 : 윤지민
 */

import java.util.Scanner;

public class NumberGameApp {
	int comNum; //컴퓨터가 만든 수
	int userNum;  //사용자가 입력한 값	
	
	// 컴퓨터 수 함수
	void init() {
	comNum = (int)(Math.random()*6)+1;
	}

	//사용자 입력 함수
	void input() {
	Scanner scanner = new Scanner(System.in);
	userNum = scanner.nextInt();
	}
	
	//높다/ 낮다 판단 /정답이면 true, 높거나 낮으면 false.
	
	boolean confirm() {
		boolean result = false;
		//com과 user를 비교해서 같으면 true 리턴
		//다르면 높다/낮다 출력하고 false 리턴
		if (comNum == userNum) {
			result = true;
		}
		else if (comNum < userNum || comNum < userNum) {
			result = false;
		}
		return result;
	}
	
	void start() {
		init();
		while(true) {
			input();
			if(confirm() == true ) {
				System.out.println("짝짝짝~~~~맞았습니다^0^~~~~");
				break;
			}
			else if (confirm() == false) {
				System.out.println("틀렸습니다.");
			}
		}
	}

}
