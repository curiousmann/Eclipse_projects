package fifth;

import java.text.ParseException;
import java.util.*;

public class Main {
public static void main (String [] args) throws ParseException{

    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    sc.close();
    System.out.println(UserMainCode.calculateBornDay(s1));

	}
}