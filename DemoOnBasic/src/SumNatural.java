
public class SumNatural {
	static int calculateSum(int n) { // Calculate Sum
		int i = 0, sum = 0;
		for (i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 100;
		System.out.println(
				"The sum of first " + n + " natural numbers which are divisible by 3 or 5 is " + calculateSum(n));
	}

}
