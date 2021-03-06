package co.yedam.numgame;

/*
 * 숫자 맞추기 게임
 * 작성자 : 윤지민
 */

import java.util.Scanner;

public class NumberGameApp {
	int comNum; //컴퓨터가 만든 수
	int userNum;  //사용자가 입력한 값	
	Scanner scanner = new Scanner(System.in);
	
	// 컴퓨터 수 함수
	void init() {
	comNum = (int)(Math.random()*6)+1;
	}

	//사용자 입력 함수
	void input() {
	
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
	
	boolean yesno () {
		String answer;
		System.out.println("게임을 다시 시작할까요?(y/n)");
		answer = scanner.next();
		if (answer == "y" || answer == "Y") {
			return true;
		}
		else {
			System.out.println("게임을 종료합니다.");
			return false;
		}
	}
	
	void start() {
		
		String insert;
		boolean bool = true;
		
		init(); //컴퓨터 임의의 숫자 생성
	
		while(true) {
			input(); // 숫자를 입력하세요. 
			
			if (confirm() == false) {             //숫자가 틀리면
				System.out.println("틀렸습니다.");
					}
			
			if(confirm() == true ) {            //숫자가 맞으면
				System.out.println("짝짝짝~~~~맞았습니다^0^~~~~");
				break;
			}
			}
		
		} // start() 괄호 닫기
				
	}
	

