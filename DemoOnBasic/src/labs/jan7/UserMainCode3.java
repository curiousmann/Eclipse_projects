package labs.jan7;
public class UserMainCode3 {
	public static int sumOfSquaresOfEvenDigits(int n) {
		int j = 0;
		while (n != 0) {
			if ((n % 10) % 2 == 0)
				j += (n%10)*(n%10);
			n /= 10;
		}
		return j;
	}

}
