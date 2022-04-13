package labs.jan7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(UserMainCode.checkSum(sc.nextInt())==1)
			System.out.println("Sum of odd digits is odd.");
		else
			System.out.println("Sum of odd digits is even.");
		sc.close();
	}

}
