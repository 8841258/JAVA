package co.memo.view;

import java.util.ArrayList;
import java.util.List;

import co.memo.access.MemoDAO;
import co.memo.model.Memo;
import co.memo.util.ScannerUtil;


public class MemoCliApp {

	MemoDAO memoList = new MemoDAO();
	
	public void start() {
		int menunum;
		do {
			menuTitle();
			menunum = ScannerUtil.readInt("입력");
			switch (menunum) {
			case 1: insert(); break;
			case 2: update(); break;
			case 3: delete(); break;
			case 4: selectAll(); break;
			case 5: selectDate(); break;
			case 6: selectContent(); break;
			}
		} while (menunum !=0);
	}
	
	private void selectDate() {
		System.out.println("검색할 날짜를 입력하세요.");
		String date = ScannerUtil.readDate();
		ArrayList<Memo> memo = memoList.selectDate(date);
		for (Memo m : memo) {
			System.out.println(m);
		}
		
	}
	
	private void selectContent() {
		System.out.println("검색할 메모 일부를 입력하세요.");
		String content = ScannerUtil.readMemo();
		ArrayList<Memo> memo = memoList.selectContent(content);
		for (Memo m : memo) {
			System.out.println(m);
		}
	}
	

	private void selectAll() {
		System.out.println("<목록>");
		List<Memo> list = memoList.selectAll();
		for (Memo f : list) {
			System.out.println(f);
		}
		
	}

	private void delete() {
		System.out.println("삭제할 메모 날짜를 입력하세요.");
		String date = ScannerUtil.readDate();
		memoList.delete(date);
		
	}
	
	private void update() {
		Memo memo = new Memo();
		System.out.println("수정할 메모 날짜를 입력하세요.");
		memo.setDate(ScannerUtil.readDate());
		System.out.println("수정할 메모 내용을 입력하세요.");
		memo.setContent(ScannerUtil.readMemo());
		memoList.update(memo);
	}

	private void insert() {
		System.out.println("메모 날짜를 입력하세요.");
		String date = ScannerUtil.readDate();
		System.out.println("메모 내용을 입력하세요.");
		String content = ScannerUtil.readMemo();
		memoList.insert(new Memo(date, content));
		
	}
	


	public void menuTitle() {
		System.out.println("~~~~메모 관리~~~~");
		System.out.println("1. 메모 등록");
		System.out.println("2. 메모 수정");
		System.out.println("3. 메모 삭제");
		System.out.println("4. 메모 전체 조회");
		System.out.println("5. 날짜 검색");
		System.out.println("6. 내용 검색");
		System.out.println("0. 종료");
		
		
		
	}
	
	
}
