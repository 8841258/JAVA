package co.yedam.app.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day_year = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(day);
		System.out.println(day_year);
		System.out.println(calendar);
		
		
		
		Calendar birth = Calendar.getInstance();
		birth.set(1993, 2,4);
		long dur = calendar.getTimeInMillis() - birth.getTimeInMillis();
		dur = dur/1000/60/60/24;
		System.out.println("일수 : " + dur);
		
		//기념일 계산
		Calendar christmas = Calendar.getInstance();
		christmas.set(2021, 11, 25);
		long dday = calendar.getTimeInMillis() - christmas.getTimeInMillis();
		dday = dday/1000/60/60/24;
		System.out.println("크리스마스 d" + dday);
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getYear() + "/" + currentDate.getMonthValue() + "/" + currentDate.getDayOfMonth());
		System.out.println(currentDate.plusDays(100));
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd E u");
		System.out.println(df.format(calendar.getTime()));
		
		
	}

}
