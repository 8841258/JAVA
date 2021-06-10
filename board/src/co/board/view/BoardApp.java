package co.board.view;

import java.util.ArrayList;

import co.board.access.BoardDAO;
import co.board.model.Board;
import co.board.util.Util;

public class BoardApp {
	BoardDAO dao = new BoardDAO();
	ArrayList<Board> board = new ArrayList<>();
	
	public void menu() {
		System.out.println("-------------------------게시판--------------------------------");
		System.out.println("1)전체리스트 2)글등록 3)글수정 4)글삭제 5)한건조회 6)댓글 7)로그인 0)종료");
		System.out.println("--------------------------------------------------------------");
		
	}
	
	public void start() {
		int menuNum;
		
		do {
			//메뉴와 메뉴 번호를 입력받는 것도 반복된다.
			menu();
			menuNum = Util.inputInt();
			
			//메뉴 번호에 따라 각 번호의 메소드가 실행된다.
			
			//전체 리스트 출력
			if (menuNum == 1) {
				
				board = dao.selectList();
				
				if (board.size() == 0) {
					System.out.println("조회된 목록이 없습니다.");
				}
				else {
					for (Board b : board) {
						System.out.println("Board [id=" + b.getId() + ", title=" + b.getTitle() + ", writer=" + b.getWriter() + "]");
					}
				}

			//글 등록
			} else if (menuNum == 2) {
				
				System.out.println("작성자를 입력하세요.");
				String writer = Util.inputS();
				System.out.println("제목을 입력하세요.");
				String title = Util.inputS();
				System.out.println("내용을 입력하세요.");
				String content = Util.inputS();
				Board b = new Board();
				b.setWriter(writer);
				b.setTitle(title);
				b.setContent(content);
				
				dao.insert(b);
				
				//글 수정
			} else if (menuNum == 3) {
				System.out.println("수정할 게시글의 번호를 입력하세요.");
				int Num = Util.inputInt();
				
				Board b = dao.oneList(Num);
				
				if (b == null) { //조회아이디가 존재하지 않음.
					System.out.println("존재하지 않는 번호입니다.");
					continue;
				}
				
				System.out.println("작성자를 입력하세요.");
				String writer = Util.inputS();
				System.out.println("제목을 입력하세요.");
				String title = Util.inputS();
				System.out.println("내용을 입력하세요.");
				String content = Util.inputS();
				
				if (!writer.equals("")) { //엔터로 넘어가는게 아니면, 즉 입력이 되면
					b.setWriter(writer); //입력
				}
				if (!title.equals("")) { //엔터로 넘어가는게 아니면, 즉 입력이 되면
					b.setTitle(title); //입력
				}
				if (!content.equals("")) {
					b.setContent(content);
				}
				
				dao.update(b);
				

				//글 삭제
			} else if (menuNum == 4) {
				
				System.out.println("삭제할 게시글의 번호를 입력하세요.");
				int Num = Util.inputInt();
				
				dao.delete(Num);
				
				
				
				//한건조회
			} else if (menuNum == 5) {
				
				System.out.println("조회할 게시글의 번호를 입력하세요.");
				int Num = Util.inputInt();
				
				Board b = dao.oneList(Num);
				System.out.println(b);
				
				//댓글
			} else if (menuNum == 6) {
				
				System.out.println("글 번호를 입력하세요.");
				int contentNum = Util.inputInt();
				System.out.println("1)댓글달기 2)댓글조회 0)이전");
				System.out.println("원하는 기능의 번호를 입력하세요.");
				int commentNum = Util.inputInt();
				
				if (commentNum == 1) {
					System.out.println("댓글 내용을 입력하세요.");
					String comment = Util.inputS();
					dao.commentInsert(contentNum, comment);
				} else if (commentNum == 2) {
					System.out.println("댓글을 조회할 글 번호를 입력하세요.");
					dao.selectList();
				} else if (commentNum == 0) {
					break;
				}
				
				
				
				
				//로그인
			} else if (menuNum == 7) {
				
			} 
			
			
			
			
			//0을 누르면 프로그램을 종료한다.
		} while (menuNum != 0);
		
		
		
	}
	
	
	
	
	
}
