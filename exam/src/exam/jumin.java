package exam;

import java.util.Calendar;

public class jumin {

	public static void main(String[] args) {
		String[] arr = { "010102-2", "991012-1", "960304-1", "881012-2", "040403-1" };

		int manNum = 0;
		int femaleNum = 0;

		for (int i = 0; i < arr.length; i++) {

			int gender = Integer.parseInt(arr[i].substring(7));

			if (gender == 1) {
				manNum += 1;
			} else if (gender == 2) {
				femaleNum += 1;
			}

		}

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);

		int ten = 0;
		int twen = 0;
		int thir = 0;
		int fort = 0;

		for (int i = 0; i < arr.length; i++) {
			// 2000년도 이전 이후
			int birth = Integer.parseInt(arr[i].substring(0, 2));
			int front = Integer.parseInt(arr[i].substring(0, 1));
			int age;
			if (front == 0) {
				// 출생년도로 나이 계산
				age = year - (2000 + birth) + 1;
				if (age < 20) {
					ten += 1;
				} else if (age < 30) {
					twen += 1;
				} else if (age < 40) {
					thir += 1;
				} else if (age < 50) {
					fort += 1;
				}
				
			} else {
				age = year - (1900 + birth) + 1;
				if (age < 20) {
					ten += 1;
				} else if (age < 30) {
					twen += 1;
				} else if (age < 40) {
					thir += 1;
				} else if (age < 50) {
					fort += 1;
				}
			}
			
		}

		System.out.printf("남 %d  여 %d\n", manNum, femaleNum);
		System.out.printf("10대  %d명\n", ten);
		System.out.printf("20대  %d명\n", twen);
		System.out.printf("30대  %d명\n", thir);
		System.out.printf("40대  %d명\n", fort);
		
	}

}
