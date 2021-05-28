package co.yedam.score2;

public class AppMain {

	public static void main(String[] args) {
		ScoreArrApp score = new ScoreArrApp();
		// score.print();

		for (int i = 0; i < score.arr.length; i++) {
			System.out.println(score.getSbjCnt(i) + "과목, 총점 : " + score.stdTotal(i));
		}
	}

}
