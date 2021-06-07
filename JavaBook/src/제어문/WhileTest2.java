package 제어문;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class WhileTest2 {

	public static void main(String[] args) {

		int a = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//while문이 바로 끝나버린다. a값이 0이므로
/*		while ( a != 0) {
			a = sc.nextInt();
			System.out.println(a);
		}
		System.out.println("end");*/
		
		do {
			a = sc.nextInt();
			System.out.println(a);
		} while (a != 0);
		System.out.println("end");
		
	}

}
