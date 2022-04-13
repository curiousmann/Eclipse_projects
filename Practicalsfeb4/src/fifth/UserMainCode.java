package fifth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {

	public static String calculateBornDay(String input) throws ParseException{

	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    SimpleDateFormat sdf1 = new SimpleDateFormat("EEEEE");
	    Date d = sdf.parse(input);
	    String s = sdf1.format(d);
	    return s.toUpperCase();


	}
}
