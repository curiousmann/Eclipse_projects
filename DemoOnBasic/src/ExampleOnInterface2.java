
public class ExampleOnInterface2 implements I2{

	

	@Override
	public void Display() {
		System.out.println("Display");
		
	}

	@Override
	public String getMessage(String s) {
		return s;
	}

	@Override
	public void methodTwo() {
		System.out.println("methodTwo");
	}
	
	public static void main(String[] args) {
		I2 i2 = new ExampleOnInterface2();
		i2.Display();
		System.out.println(i2.getMessage("getMessage"));
		i2.methodTwo();
		}
}
