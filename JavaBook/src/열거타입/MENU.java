package 열거타입;

public enum MENU {
	
	등록(1), 수정(2), 삭제(3), 종료(0);

	//필드
	int i;
	
	
	
	//생성자
	MENU(int i) {
		this.i = i;
	}
		
	//메서드
	public int getValue() {
		return i;
	}
	
	
	public void print() {
		MENU[] arr = MENU.values();
		for (MENU m : arr) {
			System.out.println(m.i + ":" + m);

		}
	}
	
	public static MENU getMenu(int v) {
		MENU[] arr = MENU.values();
		for (MENU m : arr) {
			if (m.getValue() == v) {
				return m;
			}
		}
		return null;
	}
	
	
	
	
}
