public class C extends B{
	public void methodThree() { 
		System.out.println("we are in methodC of C clas"); 
		} 
	public static void main(String[] args) { 
			C cobj = new C(); //calling the methods of B and A as well as C clasa 
			cobj.methodOne();
			cobj.methodTwo(); 
			cobj.methodThree(); 
	
	}
}