package co.memo.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import co.memo.model.Memo;


public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt(String prompt) {
		System.out.print(prompt + "> ");
		return readInt();
	}
	
	
	
	public static int readInt() {
		int result=0;
		
		
		while (true) {
		try {
			String userInput = scanner.next();
			result = Integer.parseInt(userInput);
			break;
		} catch (Exception e) {
			System.out.println("(Error) 숫자를 입력하세요.");
		}
		}
		return result;
		
	}
	
	public static String readStr() {
		String result = null;
		int i = 0;
		while (true) {
		try {
			result = scanner.next();   
			i = Integer.valueOf(result);
			System.out.println("(Error) 문자열을 입력하세요.");
			
		} catch (Exception e) {
			System.out.println(result);
			break;
		}
		}
		return result;
		
		
		
	}
	
	public static String readDate() {
		String result = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		do {
			try {
			result = scanner.next();
			Date date = sdf.parse(result.trim());
			break;
		} catch (ParseException e) {
			System.out.println("(yyyymmdd)날짜 형식이 아닙니다.");
		}
		} while (true);
		return result;
		
	}
	
	public static String readMemo() {
		String content=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			content = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return content;
		
	}

	
}
