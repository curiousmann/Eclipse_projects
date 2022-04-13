
public class ExImp2 extends ExImpl {
	@Override
	public void methodThree() {
		System.out.println("we are in methodThree"); 
		
	}
	public static void main(String[] args) { 
		ExImpl eom2= new ExImp2();
		eom2.methodThree(); 
		int res2=eom2.methodOne(); 
		System.out.println(res2); 
		String msg =eom2.methodTwo("ramu");
		System.out.println(msg);
	}
}
