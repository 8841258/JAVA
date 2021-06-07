package 제어문;

public class WhileTest {

	public static void main(String[] args) {
		//1~10 합계 구하는 for문
		
		int sum = 0;
		
		for ( int i=1; i<11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		int k = 1;
		while (true) {
			sum += k;
			++k;
			if (k == 11) {
				break;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		int j = 1;
		
		do {
			sum += j;
			j++;
			
		} while (j<11);
		System.out.println(sum);
	}

}
