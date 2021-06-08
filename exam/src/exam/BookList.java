package exam;

import java.util.ArrayList;
import java.util.List;

public class BookList extends BookAccess {
	
	ArrayList<Book> lists = new ArrayList<Book>();
	
	
	public BookList() {}

	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Override
	public void insert(Book book) {
		//lists.add(book);
		
		//isbn이 같으면 추가하지 않는다
		//isbn이 다르면 추가한다
		for (Book b : lists) {
			b.getIsbn()
		}
		if (lists.size() != 0) {
			lists.add(book);
		}
		
		
		
	}

	@Override
	public List<Book> findName(String name) {
		List<Book> a = new ArrayList<Book>();
		for (Book b : lists) {
			if (b.getName().contains(name)) {
				a.add(b);
			}
		}
		return a;
	}
	
	
	
}
