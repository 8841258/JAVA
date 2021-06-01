package 배열;

/*
 * 배열은 크기 고정. 처음에 10개라고 고정하면 10개에서 수정 불가능.
 * 순차적으로 데이터를 저장하고 읽는 용도로 주로 쓰인다.
 * 추가/삭제가 번거롭다.
 */


public class 배열초기화 {
	public static void main(String[] args) {
		
		//리스트와 배열은 다름
		int[] a;    //배열도 객체로 인식함. -> new 키워드를 이용해서 힙 영역에 메모리 할당.
		a = new int[10];
		a[0] = 10;
		a[1] = 20;
		a[2] = 100;
		a[3] = 50;

		
		//삭제 (삭제 메소드는 따로 없음... 인덱스 다음부터 앞으로 이동시킴)
		for (int i=2; i<a.length; i++) {
			a[i-1] = a[i];
		}
		
		
		for (int i=0; i<a.length; i++)
		System.out.println(a[i]);
		
		
		//배열 선언과 초기화를 한꺼번에
		int[] b = {100, 200, 300};
		
		
		
		
		
		
		
	}

}
