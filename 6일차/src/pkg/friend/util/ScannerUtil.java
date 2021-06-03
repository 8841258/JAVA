package pkg.friend.util;

import java.util.Scanner;

import pkg.friend.Friend;


public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt() {
		
	}
	
	public static String readStr() {
		
	}
	
	public static String readDate() {
		
	}
	
	public static Friend readFriend() {
		String result = scanner.next();
		String[] arr = result.split(",");
		Friend friend = new Friend();
		friend.setGubun(arr[0]);
		friend.setName(arr[1]);
		friend.setPhone(arr[2]);
		
	}
	
	
	
	
}
