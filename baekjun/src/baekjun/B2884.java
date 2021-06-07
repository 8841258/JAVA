package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B2884 {

	public static void main(String[] args) throws IOException {
		/*
		 * 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
		 * 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		 * 시간은 24가 되면 0이 되고, 분은 60이 되면 시간을 1 증가시키고 0이 된다.
		 */
		
		
		
		//시간 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hourMinute = br.readLine();
		
		//시간과 분을 변수에 담음
		// 0<= hour <= 23, 0 <= minute <= 59
		StringTokenizer st = new StringTokenizer(hourMinute);
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		
		//hour가 0~23이면 시간 변동 딱히 없음
		//minute-45<0이면 ~ hour는 1빼고, 
		//hourrk 0이면
		
		

	}

}
