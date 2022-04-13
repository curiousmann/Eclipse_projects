package labs.jan7;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		sc.close();
		if(s.length()%2==0)
			System.out.println(UserMainCode4.getMiddleChars(s));
		else
			System.out.println("String is not even length");
		
	}
}
