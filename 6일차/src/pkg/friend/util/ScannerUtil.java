package pkg.friend.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import pkg.friend.Friend;


public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt() {
		int userInputInt=0;
		//유저 인풋을 받는다
		System.out.print("숫자를 입력하세요. >> ");
		String userInput = scanner.next();
		
		try {
			userInputInt = Integer.parseInt(userInput);
			System.out.println(userInputInt);
			
		} catch (Exception e) {
			System.out.println("(Error) 숫자를 입력하세요.");
		}
		return userInputInt;
		//유저 인풋이 인트인지 확인하고 인트이면 프린트, 아니면 예외처리해서 인트 입력하라고 함

	}
	
	public static String readStr() {
		String userInputStr=null;
		
		System.out.print("문자열을 입력하세요. >> ");
		String userInput2 = scanner.next();
		
		try {
			userInputStr = (userInput2);         //?????????????
			System.out.println(userInputStr);
			
		} catch (Exception e) {
			System.out.println("(Error) 문자열을 입력하세요.");
		}
		return userInputStr;
		
		
		
	}
	
	public static String readDate() {
		String result = null;
		//입력받는다.
		System.out.println("날짜 입력");
		String userInputDate = scanner.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = sdf.parse(userInputDate);
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println("무슨 예외처리를 해야하는거야?");
		}
		return result;
		
	}
	
	public static Friend readFriend() {
		System.out.println("친구의 학교명, 이름, 전화번호를 입력하세요.");
		String result = scanner.next();
		String[] arr = result.split(",");
		Friend friend = new Friend();
		friend.setGubun(arr[0]);
		friend.setName(arr[1]);
		friend.setTel(arr[2]);
		return friend;
		
	}

	
	
	
}
