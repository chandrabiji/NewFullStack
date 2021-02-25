package collections;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println("---Time---");
		int hh = cl.get(Calendar.HOUR);
		int mm = cl.get(Calendar.MINUTE);
		int ss = cl.get(Calendar.SECOND);
		System.out.println("Time : "+hh+":"+mm+":"+ss);
		System.out.println("--Date---");
		int d = cl.get(Calendar.DATE);
		int m = cl.get(Calendar.MONTH);
		++m;
		int y = cl.get(Calendar.YEAR);
		System.out.println("Date : "+d+"/"+m+"/"+y);

	}

}
