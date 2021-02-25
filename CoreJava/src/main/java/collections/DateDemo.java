package collections;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
        System.out.println("Date : "+d);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.US);
        String result = df.format(d);
        System.out.println("Result = "+result);
	}

}
