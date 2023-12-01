package recursion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

//Introduced in java 1.8	
public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();// yyyy-mm-dd
		LocalDate yesterday = date.minusDays(1);
		LocalDate lastMonth = date.minusMonths(1);
		LocalDate prevYear = date.minusYears(1);
		LocalDate nextMonth = date.plusMonths(1);
		LocalDate nextYear = date.plusYears(1);
		LocalDate tomorrow = date.plusDays(2);
		LocalDate date1 = LocalDate.of(2016, 1, 13);
		// System.out.println(date1.isLeapYear());
		boolean aa = date.equals(date1);
		// System.out.println(aa);

		// System.out.println(date1);
		LocalDate date2 = LocalDate.of(2017, 1, 13);
		LocalDateTime datetime = date2.atTime(1, 50, 9);
		// System.out.println(datetime);

		// convert localdate to string
		String d1Str = date.format(DateTimeFormatter.ISO_DATE);
		// System.out.println("Date1 in string : " + d1Str);
		// ____________________________________________________________________

		LocalTime time = LocalTime.now();
		// System.out.println(time);
		LocalTime time2 = time.minusHours(2);
		LocalTime time3 = time2.minusMinutes(34);
		LocalTime time4 = time.plusHours(4);
		LocalTime time5 = time2.plusMinutes(18);
		// System.out.println(time3);

		ZoneId zone1 = ZoneId.of("Asia/Tokyo");
		LocalTime time1 = LocalTime.now(zone1);
		// System.out.println(time1);

		long hours = ChronoUnit.HOURS.between(time1, time2);
		// System.out.println("Hours between two Time Zone: " + hours);

		Month month = Month.valueOf("January".toUpperCase());
		System.out.printf("For the month of %s all Sunday are:%n", month);

	}
}
