
public class IncresingNum {
	static boolean checkNumber(int number) { // Check if a number is an increasing number
		if (number == 0)
			return true;
		return checkNumber(number / 10) ? ((number / 10) - (number / 100) * 10) <= (number - ((number / 10) * 10))
				: false;
	}

	public static void main(String args[]) {

		int number = 33569;
		if (checkNumber(number))
			System.out.println("Digits are in increasing order.");
		else
			System.out.println("Digits are not in increasing order.");
	}

}
