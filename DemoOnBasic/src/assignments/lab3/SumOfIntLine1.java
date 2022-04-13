package assignments.lab3;

import java.util.Scanner;

public class SumOfIntLine1 {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("enter the line of integers");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String ls[] = line.split(" ");
		
		for(int i=0;i<ls.length;i++) {
			sum+=Integer.parseInt(ls[i]);
			System.out.println(ls[i]+" "+sum);
		}
		sc.close();
	}
}
