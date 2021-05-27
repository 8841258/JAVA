package co.yedam.app;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		CalcGame game = new CalcGame();
		
		game.input();
		
		//add, share, div, rest
		System.out.println("곱셈 : " + game.add());
		System.out.println("나머지 : " + game.share());
		System.out.println("나눗셈 : " + game.divv());
		System.out.println("몫: " + game.rest());


	}

}
