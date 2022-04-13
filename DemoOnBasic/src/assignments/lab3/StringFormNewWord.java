package assignments.lab3;

import java.util.Scanner;

public class StringFormNewWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the string :");
		String s1=sc.next();
		
		//System.out.println("Enter integer: ");
		int n=sc.nextInt();
		
		String form= StringFormNewWord.formNewWord(s1,n);
		System.out.println(form);
		sc.close();
	}

	private static String formNewWord(String s1, int n) {
		int k=s1.length();
		
		String str=(String)s1.substring(0, n);
		String str1=(String)s1.substring(k-n, k);
		String str2=str.concat(str1);
		
		return str2;
	}

}
