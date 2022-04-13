public class ExampleOnMethodOverload { 
	public int getSum(int x,int y){
		int z=x+y; return z; 
		
	}
	
	public int getSum(int x,int y,int z) {
		return x+y+z; 
		
	}
	
	public void methodOne(int x,float y){
		System.out.println(x+" "+y); 
		
	}
	
	public void methodOne(float x,int y){ 
		System.out.println(x+" "+y); 
		
	}
	
	public static void main(String[] args) {
		ExampleOnMethodOverload eovl = new ExampleOnMethodOverload(); 
		int res1 =eovl.getSum(10,20);//eovl.getSum(int,int) 
		System.out.println("sum of two numbers is : "+res1); 
		eovl.methodOne(30, 40f);//methodOne(int,float) 
		eovl.methodOne(30f, 20);//methodOne(float,int) 
	}
}