package co.yedam.score2;

public class ScoreArrApp {

	int[][] arr = { { 100, 90, 80 }, { 10, 20, 30 }, { 50, 50, 50 }, { 30, 30, 30 } };

	void print() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	// 입력한 번호의 한 학생의 총점을 계산

	int stdTotal(int no) {
		int result = 0;
		for (int i = 0; i < arr[no].length; i++) {
			result += arr[no][i];
		}
		return result;
	}

	//해당 학생의 과목 수
	int getSbjCnt(int no) {
		return arr[no].length;
	}
	
}
