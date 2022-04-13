
public class ExImp5 extends Ex1 implements MyInt3 {

	@Override
	public void methodTwo() {
		System.out.println("method two");
	}
	
	public static void main(String[] args) {
		
		Ex1 ex = new ExImp5();
		System.out.println(ex.eid);
		System.out.println(ex.ename);
		ex.methodOne();
		System.out.println(MyInt3.pi);
		
		MyInt3 my = new ExImp5();
		my.methodTwo();
		
	}
}