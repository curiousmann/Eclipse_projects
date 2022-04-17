package assignments.jan7;

import java.time.LocalDate;

public class Example2 {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args){

		LocalDate d1 = LocalDate.of(2000,12,21);
		LocalDate d2 = LocalDate.now(); // Current date
		LocalDate d3 = LocalDate.of(2010,1,3);

		boolean a = d3.isAfter(d1);
		System.out.println("Date d3 comes after " +
				"date d2: " + a);

		boolean b = d3.isBefore(d2);
		System.out.println("Date d3 comes before "+
				"date d2: " + b);

		int c = d1.compareTo(d2);
		System.out.println(c);
//
//		System.out.println("Miliseconds from Jan 1 "+
//				"1970 to date d1 is " + d1.getTime());
//
//		System.out.println("Before setting "+d2);
//		d2.setTime(204587433443L);
//		System.out.println("After setting "+d2);
	}
}
