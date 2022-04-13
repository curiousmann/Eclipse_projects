
public class Second extends First{
	float f1=10.0f; 
	float f2=20.0f; 
	
	public String getMessage(String s){ 
		return "hello "+s+"welcome to java"; 
	} 
	
	public static void main(String args[]){ 
		Second s = new Second();
		
		System.out.println(s.num1);
		System.out.println(s.num2);
		
		int res = s.getSum(40,40);
		
		System.out.println("sum of salaries of two numbers is : "+res); 
		System.out.println(s.f1); 
		System.out.println(s.f2); 
		String gt = s.getMessage("sainath"); 
		System.out.println(gt); } 
}