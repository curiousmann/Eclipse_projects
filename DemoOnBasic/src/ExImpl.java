public abstract class ExImpl implements MyInterface{
	@Override
	public int methodOne() {
		int a=10,b=20;
		System.out.println("we are in methodOne");
		return a+b; 
		
	} 
	@Override 
	public String methodTwo(String s) {
		return "welcome to methodTwo "+s; 
		
	} //public abstract void methodThree(); 
	
} 