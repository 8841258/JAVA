package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1330 {

	public static void main(String[] args) throws IOException {
		//A B를 입력받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		//A B를 정수로 변환하여 변수에 담음
		StringTokenizer st = new StringTokenizer(input);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		/*
		 * A가 B보다 큰 경우에는 '>'를 출력한다.
			A가 B보다 작은 경우에는 '<'를 출력한다.
			A와 B가 같은 경우에는 '=='를 출력한다.
		 */
		
		if (a > b) {
			System.out.println(">");
		}
		else if (a < b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		
		
	}

}
