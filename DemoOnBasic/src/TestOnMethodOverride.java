public class TestOnMethodOverride extends ExampleOnOverride{ 
	@Override
	public void methodOne(){ 
		System.out.println("we are in methodOne of TestChild class");

	}
	
	public void methodThree() {
		System.out.println("we are in methodThree of TestChild Clas");
		
	} 
	
	public static void main(String[] args) { 
		TestOnMethodOverride tomv = new TestOnMethodOverride();
		ExampleOnOverride eomv = new TestOnMethodOverride();

		tomv.methodOne();
		tomv.methodTwo();
		tomv.methodThree();
		eomv.methodOne();
		eomv.methodTwo();

		
	} 
	
} 