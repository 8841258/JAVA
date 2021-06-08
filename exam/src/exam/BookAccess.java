package exam;

import java.util.List;

public abstract class BookAccess {
	
	//생성자
	public BookAccess() {}
	
	//
	public abstract void insert(Book book);
	
	public abstract List<Book> findName(String name);
	
	
}
