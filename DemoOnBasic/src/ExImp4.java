
public class ExImp4 implements MyIn1, MyIn2{

	@Override
	public int getSum(int x, int y) {
		return x+y;
	}

	@Override
	public int getAddition(int x, int y, int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		MyIn1 in1 = new ExImp4();
		MyIn2 in2 = new ExImp4();
		
		System.out.println(in1.getAddition(30, 80, 50));
		System.out.println(in2.getSum(50, 30));
		
	}
}
