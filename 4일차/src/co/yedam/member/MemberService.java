package co.yedam.member;

import java.util.Scanner;

public class MemberService {
	Member[] members = new Member[10];
	int cnt=0;
	
	void insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("id>");
		String id = scanner.next();
		System.out.print("name>");
		String name = scanner.next();
		System.out.print("password>");
		String password = scanner.next();
		System.out.print("age>");
		int age = scanner.nextInt();
		
		members[cnt++] = new Member(id, name, password, age);
	}
	
	//회원 리스트
	void printList() {
		for (int i=0; i<cnt; i++) {
			System.out.println(members[i]);
		}
	}
	
	void printMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("번호>");
		int i = scanner.nextInt();
		System.out.println(members[i].name);
		System.out.println(members[i].id);
		System.out.println(members[i].age);
	}
	
	void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("id>");
		String i = scanner.next();
		System.out.println("password>");
		String p = scanner.next();
		
		for (int k=0; k<cnt; k++) {
		if (i.equals(members[k].id) && p.equals(members[k].password)) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("id 또는 password가 틀립니다.");
		}
		
		}
	}
	
	void select() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("id>");
		String idd = scanner.next();
		for (int i=0; i<cnt; i++) {
		if (idd.equals(members[i].id)) {
			System.out.println(members[i]);
		}
		else {
			System.out.println("조회된 id가 없습니다.");
		}
		}
	}
	
	
	
	boolean login(String id, String password) {
		boolean result = false;
		for (int i=0; i<cnt; i++) {
			if (id.equals(members[i].id) && password.equals(members[i].password)) {
				result = true;
				break;
			}
		}
		return result;
		}


	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
