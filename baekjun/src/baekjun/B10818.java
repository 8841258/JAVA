package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class B10818 {
	/*
	 * 5
	   20 10 35 30 7
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int num = Integer.parseInt(br.readLine());
		String fiveNum = br.readLine();
		StringTokenizer st = new StringTokenizer(fiveNum);
		int arr[] = new int[num];
		
		for (int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[num-1]);
		

	}

}
