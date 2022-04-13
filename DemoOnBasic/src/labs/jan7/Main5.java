package labs.jan7;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(UserMainCode5.checkCharacters(sc.nextLine())==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		sc.close();
			
	}

}
