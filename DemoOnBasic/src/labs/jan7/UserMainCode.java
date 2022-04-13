package labs.jan7;

public class UserMainCode {

	public static int checkSum(int num) {
		int j = 0;
		while (num != 0) {
			if ((num % 10) % 2 != 0)
				j += num;
			num /= 10;
		}
		return j % 2 == 0 ? -1 : 1;
	}
}
