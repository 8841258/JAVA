package 배열;

import java.util.Scanner;

public class 객체배열인터넷메인 {
	
	
	public static void main(String[] args) {
		객체배열인터넷[] array = new 객체배열인터넷[5];
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<array.length; i++) {
			System.out.print("ID 입력> ");
			String ID = scanner.next();
			System.out.print("이름 입력> ");
			String Name = scanner.next();
			System.out.print("성별 입력> ");
			String Gender = scanner.next();
			System.out.print("학점 입력> ");
			int Credit = scanner.nextInt();
			
			array[i] = new 객체배열인터넷(ID, Name, Gender, Credit);
		}

		System.out.println(array);
	}

}
