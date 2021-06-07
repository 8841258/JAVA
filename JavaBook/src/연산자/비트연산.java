package 연산자;

public class 비트연산 {
	
	/*
	 *  ^ : xor - 서로 다르면 1 (암호화)
	 *  & : and - 마스크
	 *  | : or
	 */

	public static void main(String[] args) {
		
		//암호화/복호화
		int a = 04474;
		int key = 01111;
		System.out.println("원본" + a);
		
		int b = a ^ key;
		System.out.println("암호화" + b);
		
		int c = b ^ key;
		System.out.println("복호화" + c);
		
		int d = 0b10101111;
		int e = 0b00000010;
		System.out.println(Integer.toBinaryString(d&e));
		
		
		
		
		
	}

}
