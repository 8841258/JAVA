package co.yedam.score;

public class ScoreArrApp {
	int a = 10;
	int[] arr = {91,94,50};
	
	void print() {
		for (int i=0; i<arr.length; i++) {	
			System.out.println(arr[i]);
		}
	}
	
	int total() {
		int result = 0;
		
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}	
		return result;
	}
	
	double avg() {
		double result = 0;
		result = (double)total()/arr.length;	
		return result;
	}
	
	void printH( ) {
		System.out.printf("%s\n국어:%d\t영어:%d\t수학:%d\n", "홍길동성적", arr[0], arr[1], arr[2]);
	}
	
}
