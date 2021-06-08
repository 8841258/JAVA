package exam;

import java.util.List;
import java.util.Scanner;


public class BookServiceFind implements BookService {


	
	//생성자
	public BookServiceFind() {}
	
	
	@Override
	public void execute(BookList booklist) {
		//내용조회
		System.out.println("책 제목 일부를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		List<Book> a = booklist.findName(name);
		for (Book b : a) {
			System.out.println(b);
		}
		
		
	}

}
