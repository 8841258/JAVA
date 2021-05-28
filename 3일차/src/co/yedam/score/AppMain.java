package co.yedam.score;

public class AppMain {

	public static void main(String[] args) {
		ScoreArrApp score = new ScoreArrApp();
		score.print();
		System.out.printf("총점=%04d\n",score.total());
		System.out.printf("평균=%4.2f\n",score.avg());
		score.printH();
		
	}

}
