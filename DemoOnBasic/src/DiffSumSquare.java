
public class DiffSumSquare {
	static int calculateDifference(int n) { // Calculate the difference

		int sum = 0, sqsum = 0, lim = 1;
		while (lim < n + 1) {
			sum += lim;
			sqsum += lim * lim;
			lim++;
		}
		return (sum * sum) - sqsum;
	}

	public static void main(String[] args) {
		int lim = 10;
		System.out.println("Difference between the sum of the squares and the square of the sum of the first " + lim
				+ " natural numbers is " + calculateDifference(lim));
	}

}
