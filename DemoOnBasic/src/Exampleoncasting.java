
public class Exampleoncasting {
	public static void main(String args[]) {

		int a = 10;

		System.out.println("before typecast " + a);

		double b = a; // widening casting or implicit casting

		System.out.println("the value of a variable is " + b);

		double d = 20.0;

		System.out.println("before converting : " + d);

		int c = (int) d;// narrowing casting or explicit casting

		System.out.println("the value of a variable is " + c);

		float x = (float) d; // converting double to float

		System.out.println(x);

		long aa = 30;

		System.out.println("before converting : " + aa);

		float y = aa; // converting long to float

		System.out.println("after converting : " + y);

		char ct = 'A';

		System.out.println("before converting : " + ct);

		double cti = ct;

		System.out.println("after converting : " + cti);

		int mt = 70;

		System.out.println("before converting : " + mt);

		char mtc = (char) mt;

		System.out.println("after converting : " + mtc);

	}

}
