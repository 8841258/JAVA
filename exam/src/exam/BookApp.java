package exam;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		BookList list = new BookList();
		list.insert(new Book("1","자바","자바를 배우자"));
		list.insert(new Book("2","JSP","JSP 기초"));
		list.insert(new Book("3","JSP응용","JSP 심화학습"));
		list.insert(new Book("4","자바웹","JSP 응용"));
		int menu =0;
		do {
		System.out.println("1.등록   2.내용조회  0.종료");
		System.out.println("입력>");
		Scanner scanner = new Scanner(System.in);
		menu = scanner.nextInt();
		//조회
		if(menu ==2) {
			BookServiceFind service1 = new BookServiceFind();
			service1.execute(list);
		//등록
		}else if (menu == 1) {
			BookServiceInsert service2 = new BookServiceInsert();
			service2.execute(list);
		}	
		}while(menu !=0);
	}

}
