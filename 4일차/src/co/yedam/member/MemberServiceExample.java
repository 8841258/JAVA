package co.yedam.member;

import java.util.Scanner;


public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService app = new MemberService();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 등록 | 2. 전체 조회 | 3. 번호로 조회 | 4. 로그인 | 5. id로 조회 | 6. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");
			selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				app.insert();
			}
			if (selectNo == 2) {
				app.printList();
			}
			if (selectNo == 3) {
				app.printMember();
			}
			if (selectNo == 4) {
				app.login();
			}
			if (selectNo == 5) {
				app.select();
			}
			if (selectNo == 6) {
				run = false;
				System.out.println("bye~~~~~~~~~~~~~~");
			}
			
		}

		

	}

}
