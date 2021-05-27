package co.yedam.app;

import java.util.Scanner;

/*
 * �� ��ȯ
 * ������ : byte < short < int   < long
 * �Ǽ��� :                float < double
 * 
 * ��Ʈ�� <------> byte    Byte.parseByte(����)
 *              short    Short.pharseShort(����)
 *              int      Integer.parseInt
 *              long     
 *              float
 *              double
 *              char
 *              boolean
 */



public class CastTest {

	public static void main(String[] args) {
		// �ڵ�����ȯ
		int a= 10;
		long b = a;
		
		// ��������ȯ
		a = (int)b;
		
		//char(����) <-> int(�ڵ�)
		char c = 'Z';
		System.out.println((int)c);
		
		int d = 97;
		System.out.println((char)d);
		
		// �Ǽ�(double) -> ����(int)
		double e = 10.5;
		long f = (long)e;
		System.out.println(f);
		
		// ���� ������ �ڵ����� ����ȯ
		double g = 5 + 10.5;
		String h = "hi" + 5;
		System.out.println(h);
		
		//���������� �������� ����, �ϳ��� �Ǽ��� ������ָ� �˾Ƽ� �Ǽ��� ���
		double i = 5 / (double)2;
		System.out.println(i);
		
		// ��Ʈ�� -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		
		// int -> ��Ʈ��
		String s2 = String.valueOf(j);
		
		Scanner scanner = new Scanner(System.in);
		String greet = scanner.next();
		
		System.out.println(greet);
		
	}

}
