package assignments.lab3;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int r=reverse(n);
		System.out.println("The reverse of the given number is : "+r);
		sc.close();
	}
	
	static int reverse(int n) {
		int rem=0,rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	
}
