package exam;

import java.util.List;
import java.util.Scanner;

public class BookServiceInsert implements BookService {


	public BookServiceInsert() {}
	
	@Override
	public void execute(BookList booklist) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("isbn을 입력하세요.");
		String isbn = sc.next();
		
		System.out.println("책 제목을 입력하세요");
		String name = sc.next();
		
		System.out.println("책 내용을 입력하세요.");
		String content = sc.next();
		
		Book book = new Book(isbn, name, content);
		booklist.insert(book);
		
		
		
		
		
	}

}
