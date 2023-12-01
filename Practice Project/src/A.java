import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class A {

	public static final String OLD_DATE_FORMAT = "dd-MM-yyyy";
	public static final String SLASH_DATE_FORMAT = "dd/MM/yyyy";
	public static final String NEW_DATE_FORMAT = "yyyy-MM-dd";
	public static final String TIME_FORMAT = "HH:mm:ss";

	public static String convertOnestringFtoAnother(String dateaccepted) {
		String dateInString = "";
		try {
			Date date = new SimpleDateFormat(SLASH_DATE_FORMAT).parse(dateaccepted);
			dateInString = new SimpleDateFormat(NEW_DATE_FORMAT).format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateInString;
	}

	public static int differenceBetweenDates(Date startDate, Date endDate) throws ParseException {
		LinkedList<Date> list = null;
		int dateDifference = 0;
		try {
			Date begin = new Date(startDate.getTime());
			list = new LinkedList<Date>();
			list.add(new Date(begin.getTime()));
			while (begin.compareTo(endDate) < 0) {
				begin = new Date(begin.getTime() + 86400000);// one day increase
				list.add(new Date(begin.getTime()));
			}
			dateDifference = list.size();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return dateDifference;
	}

	public static int getDaysBetweenDates(Date startdate, Date enddate) {
		List<Date> dates = null;
		int day = 0;
		try {
			dates = new ArrayList<Date>();
			long interval = 1000 * 60 * 60 * 24;
			long endTime = enddate.getTime();
			long currentTime = startdate.getTime();
			while (currentTime <= endTime) {
				dates.add(new Date(currentTime));
				currentTime += interval;
			}
			day = dates.size();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return day;
	}

	public static String formatDate(String date, String pattern) {
		Date formatedDate = null;
		String newDate = null;
		try {
			if (date != null) {
				formatedDate = new SimpleDateFormat(pattern).parse(date);
				newDate = new SimpleDateFormat(NEW_DATE_FORMAT).format(formatedDate);
			} else {
				newDate = "";
			}
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return newDate;
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		// Date startDate = sdf.parse("01-07-2023");
		// String d1 = "01-07-2023";
		// Date endDate = sdf.parse("10-07-2023");
		// String dt = formatDate(d1, "dd-MM-yyyy");
	}
}
