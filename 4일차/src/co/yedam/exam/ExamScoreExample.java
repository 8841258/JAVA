package co.yedam.exam;

public class ExamScoreExample {

	public static void main(String[] args) {
		ExamScore examScore = new ExamScore("몰라", 60, 60, 59);
		System.out.println((examScore.isPass()) ? "합격":"불합격");

	}

}
