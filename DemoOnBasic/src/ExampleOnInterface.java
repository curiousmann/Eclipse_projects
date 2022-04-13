
public class ExampleOnInterface implements MyApp {

	@Override
	public int getSum(int x, int y) {
		return x+y;
	}

	@Override
	public int getAddition(int x, int y, int z) {
		return x+y+z;
	}

	public static void main(String[] args) {
		ExampleOnInterface ex = new ExampleOnInterface();
		System.out.println(ex.getSum(50, 10));
		System.out.println(ex.getAddition(40, 20, 70));
		
		MyApp mx = new ExampleOnInterface();
		System.out.println(mx.getSum(70, 30));
		System.out.println(mx.getAddition(30, 50, 90));
	}
}
