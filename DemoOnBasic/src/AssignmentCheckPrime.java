
public class AssignmentCheckPrime {
	static boolean IsPrime(int x) {
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		int a = 37;
		if (IsPrime(a))
			System.out.println(a + " is prime");
		else
			System.out.println(a + " is not prime");

	}
}
