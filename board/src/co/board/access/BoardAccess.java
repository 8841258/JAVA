package co.board.access;

import java.util.ArrayList;

import co.board.model.Board;

public interface BoardAccess {
	//전체 리스트 조회
	public ArrayList<Board> selectList();
	
	//글 등록
	public void insert(Board board);
	
	//글 수정
	public void update(Board board);
	
	//글 삭제
	public void delete(int id);
	
	//한건 조회(상세보기)
	public Board oneList(int id);
	
	//댓글

	
	
	
}
