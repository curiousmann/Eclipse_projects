
public class PowerOfTwo {
	static int exp = 1;

	static boolean checkNumber(int n) { // Checks if the entered number is a power of two or not
		if (n == 2 || n == 1)
			return true;
		else if (n % 2 != 0 || n == 0)
			return false;
		else {
			exp++;
			return checkNumber(n / 2);
		}
	}

	public static void main(String[] args) {

		int num = 1024;
		exp = (num == 1 ? 0 : 1);
		System.out.println(
				checkNumber(num) ? num + " is a power of 2 " + "(2^" + exp + ")." : num + " is not a power of 2.");

	}
}
