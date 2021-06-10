package co.board.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Util {
	static Scanner sc = new Scanner(System.in);
	
	//숫자 입력받음
	public static int inputInt() {
		int num=0;
		
		while (true) {
		try {
			String inputInt = sc.next();
			
			//숫자가 아니라 글자로 입력하면 오류가 뜰 것이다.
			num = Integer.parseInt(inputInt);
			break;
		} catch (Exception e) {
			System.err.println("숫자 형식으로 입력하세요.");
		}
		}
		return num;	
	}
	
	
	
	
	//띄어쓰기를 포함한 String 입력받음.
	public static String inputS() {
		String s=null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return s;
		
	}
	
	
	
	
	
}
