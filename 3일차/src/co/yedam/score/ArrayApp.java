package co.yedam.score;

import java.util.Scanner;

public class ArrayApp {
		//10개의 배열 선언. 안엔 값이 없음
		int[] arr;  //성적 저장 배열
		int studentNum; //학생 수 저장
		
		Scanner scanner = new Scanner(System.in);
		
		void init() {
			System.out.print("인원수를 입력하세요.");
			studentNum = scanner.nextInt();
			arr = new int[studentNum];
		}
		
		
		void input() {
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("scores[%d]>", i);
				arr[i] = scanner.nextInt();
				
			}

		}
		
		//배열 출력
		void print() {
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("scores[%d]>%d", i, arr[i]);
				System.out.println();
			}
		}
		
		//배열 합계
		double avg() {
			int sum = 0;
			for (int i=0; i < arr.length; i++) {
				sum += arr[i];
			}
			double result = (double)sum / arr.length;
			return result;
		}
		
		//배열 최대값
		int max() {
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			int result = max;
			return result;
		}
		
		void printavgmax() {
			System.out.printf("최고 점수: %d\n평균 점수: %f", max(), avg());
			System.out.println();
		}
		
		public static void main(String[] args) {
			ArrayApp app = new ArrayApp();
			boolean run = true;
			Scanner scanner = new Scanner(System.in);
			int selectNo = 0;
			
			while(run) {
				System.out.println("---------------------------------------------------");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("---------------------------------------------------");
				System.out.print("선택>");
				selectNo = scanner.nextInt();
				
				if (selectNo == 1) {
					app.init();
				}
				if (selectNo == 2) {
					app.input();
				}
				if (selectNo == 3) {
					app.print();
				}
				if (selectNo == 4) {
					app.printavgmax();
				}
				if (selectNo == 5) {
					System.out.println("프로그램을 종료합니다.");
					run = false;
				}
				
			}

			
		}
	}

/*

System.out.println();
// 합계


// 최대값

}
}
*/
