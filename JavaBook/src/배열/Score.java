package 배열;

public class Score {
	//필드
	String name;
	int kor;
	int mat;
	int eng;
	int total;
	double avg;
	

	
	
	//생성자, 생성자 안에서 합계와 평균을 계산.
	public Score(String name, int kor, int mat, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		
		this.total = kor + mat + eng;
		this.avg = (double) this.total / 3;
	}
	
	
	
	
}
