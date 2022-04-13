
public class ExampleOnTypePromotion {
	public void methodOne(int a){
		System.out.println("int value of a is "+a); 
		
	}
	public void methodOne(float a){ 
		System.out.println("float value of a "+a); 
		
	}
	public void methodOne(double a){ 
		System.out.println("double value of a "+a); 
		
	}
	public static void main(String[] args) {
		ExampleOnTypePromotion eotp = new ExampleOnTypePromotion(); 
		eotp.methodOne(10); //methodOne(int) 
		eotp.methodOne(97.0f);//methodOne(float) 
		eotp.methodOne(70.0); //methodOne(double) //typePromotion 
		eotp.methodOne('a');// methodOne(char) //->methodOne(int),methodOne(long), }
	}
}
