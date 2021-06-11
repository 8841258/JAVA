package co.board.access;

import co.board.util.Util;
import co.board.view.BoardApp;

public class LogIn {
	
	
	public boolean loginCheck() {
		boolean bool = false;
		MemberDAO mdao = new MemberDAO();
		System.out.println("아이디> ");
		String id = Util.inputS();
		System.out.println("비밀번호> ");
		String password = Util.inputS();
		String str = mdao.logIn(id, password);
		
		
		if (str.equals("로그인 성공!")) {
			bool = true;
		}

		return bool;
	}
	
	
	
	public void login() {
		if (loginCheck()) {
			BoardApp app = new BoardApp();
			
			app.start();
		}
		else {
			System.out.println("권한이 없습니다.");
		}
	}

}
