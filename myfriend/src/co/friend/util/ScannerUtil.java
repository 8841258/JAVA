package co.friend.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import co.friend.model.Friend;


public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt(String prompt) {
		System.out.println(prompt + ">");
		return readInt();
	}
	
	
	
	public static int readInt() {
		int result=0;
		//유저 인풋을 받는다
		
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
		//유저 인풋이 인트인지 확인하고 인트이면 프린트, 아니면 예외처리해서 인트 입력하라고 함

	}
	
	public static String readStr() {
		String userInputStr=null;
		
		while (true) {
		try {
			userInputStr = scanner.next();        
			break;
		} catch (Exception e) {
			System.out.println("(Error) 문자열을 입력하세요.");
		}
		}
		return userInputStr;
		
		
		
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
	
	public static Friend readFriend() {
		System.out.println("구분,이름,전화번호를 입력하세요. >> ");
		String result = scanner.next();
		String[] arr = result.split(",");
		Friend friend = new Friend(arr[0], arr[1], arr[2]);
		return friend;
		
	}

	
	
	
}
