package co.board.model;

public class Board {
	private int id;
	private String title;
	private String writer;
	private String Content;
	private String u_id;
	private String u_pass;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", Content=" + Content + "]";
	}

	
	
	
	
	
}
