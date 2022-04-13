package labs.jan7;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(UserMainCode2.validateNumber(sc.next())==1)
			System.out.println("Valid number format");
		else
			System.out.println("Invalid number format");
		sc.close();
	}

}
