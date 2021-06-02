package homework;

public class Book {
	private String title;
	private String author;
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public Book(String title) {
		this(title, "Unknown Authour");
	}
	
	public Book() {
		this("","");
	}

	public void print() {
		System.out.printf("Title:%s  Authour:%s\n", title, author);
	}
}
