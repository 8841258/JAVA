package co.board.view;

import java.util.ArrayList;

import co.board.access.BoardDAO;
import co.board.access.MemberDAO;
import co.board.model.Board;
import co.board.model.Member;
import co.board.util.Util;

public class BoardApp {

	String u_id=null;

	BoardDAO dao = new BoardDAO();
	MemberDAO mdao = new MemberDAO();
	ArrayList<Board> board = new ArrayList<>();

	public void menu() {
		System.out.println("-------------------------게시판--------------------------------");
		System.out.println("1)전체리스트 2)글등록 3)글수정 4)글삭제 5)한건조회 6)댓글 0)종료");
		System.out.println("--------------------------------------------------------------");

	}

	public boolean loginCheck() {
		boolean bool = false;
		MemberDAO mdao = new MemberDAO();
		System.out.println("아이디> ");
		u_id = Util.inputS();
		System.out.println("비밀번호> ");
		String password = Util.inputS();
		String str = mdao.logIn(u_id, password);

		if (str.equals("로그인 성공!")) {
			bool = true;
		}

		return bool;
	}

	public void start() {
		int menuNum;

		if (loginCheck()) {

			do {
				// 메뉴와 메뉴 번호를 입력받는 것도 반복된다.
				menu();
				System.out.println("원하는 메뉴 번호를 입력하세요.");
				menuNum = Util.inputInt();

				// 메뉴 번호에 따라 각 번호의 메소드가 실행된다.

				// 전체 리스트 출력
				if (menuNum == 1) {

					board = dao.selectList();

					if (board.size() == 0) {
						System.err.println("조회된 목록이 없습니다.");
					} else {
						for (Board b : board) {
							System.out.println("Board [id=" + b.getId() + ", title=" + b.getTitle() + ", writer="
									+ b.getWriter() + "]");
						}
					}

					// 글 등록
				} else if (menuNum == 2) {
					System.out.println("제목을 입력하세요.");
					String title = Util.inputS();
					System.out.println("내용을 입력하세요.");
					String content = Util.inputS();
					Board b = new Board();
					b.setWriter(u_id);
					b.setTitle(title);
					b.setContent(content);

					dao.insert(b);

					// 글 수정
				} else if (menuNum == 3) {
					System.out.println("수정할 게시글의 번호를 입력하세요.");
					int Num = Util.inputInt();

					Board bo = dao.oneList(Num);
					if (bo.getWriter().equals(u_id)) {
						if (dao.checkId(Num)) { // 게시글의 번호가 있으면 수정한다.
							Board b = dao.oneList(Num);

							System.out.println("제목을 입력하세요.");
							String title = Util.inputS();
							System.out.println("내용을 입력하세요.");
							String content = Util.inputS();


							if (!title.equals("")) { // 엔터로 넘어가는게 아니면, 즉 입력이 되면
								b.setTitle(title); // 입력
							}
							if (!content.equals("")) {
								b.setContent(content);
							}

							dao.update(b);
						}

						else { // 게시글의 번호가 없으면, 수정할 번호가 없다는 메세지를 출력한다.
							System.err.println("수정할 번호가 없습니다.");
						}
					} else {
						System.out.println("권한이 없습니다.");
					}
					

					// 글 삭제
				} else if (menuNum == 4) {

					System.out.println("삭제할 게시글의 번호를 입력하세요.");
					int Num = Util.inputInt();
					
					Board b = dao.oneList(Num);
					
					if (b.getWriter().equals(u_id)) {
						dao.delete(Num);
						
					} else {
						System.out.println("권한이 없습니다.");
					}
					

					// 한건조회
				} else if (menuNum == 5) {

					System.out.println("조회할 게시글의 번호를 입력하세요.");
					int Num = Util.inputInt();

					Board b = dao.oneList(Num);
					System.out.println(b);

					// 댓글
				} else if (menuNum == 6) {
					int commentNum;

					do {
						System.out.println("1)댓글달기 2)댓글조회 0)이전");
						System.out.println("원하는 기능의 번호를 입력하세요.");
						commentNum = Util.inputInt();

						if (commentNum == 1) {

							System.out.println("댓글을 달 글 번호를 입력하세요.");
							int contentNum = Util.inputInt();
							System.out.println("댓글 내용을 입력하세요.");
							String comment = Util.inputS();

							dao.commentInsert(contentNum, comment);

						} else if (commentNum == 2) {

							System.out.println("댓글을 조회할 글 번호를 입력하세요.");
							int num = Util.inputInt();

							dao.selectComment(num);
						}

					} while (commentNum != 0);

				}

				// 0을 누르면 프로그램을 종료한다.
			} while (menuNum != 0);

		} else {
			System.out.println("권한이 없습니다.");
		}

	}

}
