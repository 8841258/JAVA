package co.yedam.app.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class ScoreInputTest {

	public static void main(String[] args) {
		try {
			BufferedReader fr = new BufferedReader(new FileReader("d:/temp/poohpiglet.txt"));
			PrintStream out = System.out;
			String a;
			while (true) {
				a = fr.readLine();
				String[] score = a.split(" ");
				Integer.parseInt(score[0]);
				//숙제임...
				if (a == null) break;
				out.println(a);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
