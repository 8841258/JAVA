package co.yedam.score;

public class ArrayApp {
		//10개의 배열 선언. 안엔 값이 없음
		int[] arr = new int[10];
		//배열에 무작위 10개값 생성
		void init() {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 100) + 1;
			}

		}
		
		//배열 출력
		void print() {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
		//배열 합계
		void total() {
			int result = 0;
			for (int i = 0; i < arr.length; i++) {
				result += arr[i];
			}
			System.out.println("합계=" + result);
		}
		
		//배열 최대값
		void max() {
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println("최댓값=" + max);
		}
		
		public static void main(String[] args) {
			ArrayApp app = new ArrayApp();
			app.init();
			app.total();
			app.max();
			app.print();
			
			
		}
	}

/*

System.out.println();
// 합계


// 최대값

}
}
*/
