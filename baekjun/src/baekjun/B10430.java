package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;




public class B10430 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//디폴트가 스페이스
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		//배열 생성
		int[] arr = new int[3];
		
		//배열에 값 넣기
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int A = arr[0];
		int B = arr[1];
		int C = arr[2];
		
		bw.write( (A+B)%C );
		bw.write( ((A%C) + (B%C))%C );
		bw.write( (A*B)%C );
		bw.write( ((A%C) * (B%C))%C );
		bw.close();
	}

}
