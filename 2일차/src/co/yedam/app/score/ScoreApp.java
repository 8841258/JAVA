package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적 처리 프로그램
 * 국어, 영어, 수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade;
	
	//성적 입력
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 성적 입력 >> ");
		kor = scanner.nextInt();
		System.out.println("영어 성적 입력 >> ");
		eng = scanner.nextInt();
		System.out.println("수학 성적 입력 >> ");
		mat = scanner.nextInt();
		scanner.close();
	}
	//합계 계산
	int getSum() {
		sum = kor + eng + mat;
		return sum;
	}
	
	float getAvg() {
		avg = (float)((kor+eng+mat)/3);
		return avg;
	}
	
	boolean isPass() {
		if (avg >= 60) {
			return true;
		}
		else {
			return false;	
			}
		}

	char getGrade() {
		switch ((int)avg/10) {
		case 10:
		case 9:
		case 8:
			System.out.println('상'); 
			break;
		case 7:
		case 6:
			System.out.println('중'); 
			break;
		default:
			System.out.println('하'); 
			break;
		}
		return grade;
		
		
		
		
		}
	}
	
	


