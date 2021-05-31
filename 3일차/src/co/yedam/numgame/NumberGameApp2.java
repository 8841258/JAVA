package co.yedam.numgame;

/*
 * 숫자 맞추기 게임
 * 작성자 : 윤지민
 */

import java.util.Scanner;

public class NumberGameApp2 {
	int comNum; //컴퓨터가 만든 수
	int userNum;  //사용자가 입력한 값	
	
	// 컴퓨터 수 함수
	void init() {
	comNum = (int)(Math.random()*6)+1;
	}

	//사용자 입력 함수
	void input() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("숫자를 입력하세요.(1~6) >> ");
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
	
	/*
	 * 입력값을 받아서 y -> 종료
	 * n -> 다시 게임 시작
	 */
	
	void start() {
		
		init(); // 컴퓨터의 랜덤 숫자 생성
		
		while(true) {
			input();
			
		}
		
		} // start() 괄호 닫기
				
	}
	

