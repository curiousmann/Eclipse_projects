public class ExampleOnBlocks {
	int studentId;
	int a, b;
	int x = 10, y = 20;
//instance variables 
//instance block 
	{
		System.out.println("we are in instance block");
	}
//static block static 
	static {
		System.out.println("we are in static block");
	}

	public static void main(String[] args) {
//	 System.out.println("we are in static main method "); 
		//ExampleOnBlocks eob = new ExampleOnBlocks();
	}
}