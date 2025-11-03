package day4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DateTest {
	
	public static void main(String[] args) {
		
		// 현재시간
		LocalDate date = LocalDate.now();
		
		// 2가지 방법이 있다
		LocalDate birth = // LocalDate.of(1986, 10, 27);
						  LocalDate.parse("1986-10-27");
		System.out.println(birth);
		
		Period period = Period.between(birth, date);
		System.out.println("내 나이가 어때서! " + period.getYears() + "년");
		System.out.println( period.getMonths() + "월");
		System.out.println( period.getDays() + "일");
		
		// System.out.println( "내 나이가 어때서! " period.getYears()
		//					+ period.getMonths() + "월"
		//					+ period.getDays() + "일");
		
		// 시간
		
		LocalTime stime = LocalTime.of(9, 10);
		LocalTime etime = LocalTime.of(16, 30);
		Duration duration = Duration.between(stime, etime);
		System.out.println(duration.toHours() + " 시간 ");
		System.out.println(duration.toMinutes() + " 분 ");
		
	}
}
