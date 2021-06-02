package homework;

import java.util.Scanner;
/*
 * using objective array-> book info register, update, delete, search functions/methods
 */
public class BookService implements Service{
	
	Book[] books;
	int cnt;			//입력건수
	int maxCnt = 10;	//최대건수
	
	Scanner scanner = new Scanner(System.in);
	
	public BookService() {
		books = new Book[maxCnt];
	}
	
	//register
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("Unable to add more...");
			return;
		}
		System.out.printf("Title>");
		String title = scanner.next();
		System.out.print("Authour>");
		String author = scanner.next();
		books[cnt++] = new Book(title, author); 
		System.out.println("Registered Book nummber:" + cnt);
	}
	
	//수정
	public void update() {
		System.out.printf("수정할 번호>");
		int idx = scanner.nextInt();
		if(idx >= cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.print("저�?>");
		String author = scanner.next();
		books[idx].setAuthor(author); 
		System.out.println("수정�?�었습니다.");
	}
	
	//삭제
	public void delete() {
		System.out.printf("삭제할 번호>");
		int idx = scanner.nextInt();
		if(idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		for(int i=idx; i<cnt-1; i++) {
			books[i] = books[i+1];
		}
		cnt--;
		System.out.println("삭제�?�었습니다.");
	}
	
	//전체조회
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s", "�?�서명", "저�?"));
		System.out.println("================================================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(i);
			System.out.println(String.format("%-20s %-20s", books[i].getTitle(), books[i].getAuthor()));
		}
		System.out.println("================================================================");
	}
	
	//단건조회(타�?�틀)
	public void selectOne() {
		System.out.printf("조회할 번호>");
		int idx = scanner.nextInt();
		if(idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.println(String.format("�?�서명:%s   저�?:%s", books[idx].getTitle(), books[idx].getAuthor()));
	}
	
}
