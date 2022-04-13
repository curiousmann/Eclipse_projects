
public class ExImp6 implements MyTest {

	@Override
	public void methodOne() {
	System.out.println("method 1");		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "welcome";
	}

	public static void main(String[] args) {
		ExImp6 e = new ExImp6();
		e.methodOne();
		System.out.println(e.getMessage());
		
	}
}
