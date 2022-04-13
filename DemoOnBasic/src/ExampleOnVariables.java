
public class ExampleOnVariables {

	int empId=1001; //declared and initialzed
	String empName="allen";
	float salary=3000f; //instance variables 
	static double pi=3.142;//static variable 
	
	public void methodOne(){ //instance method 
		int a=20; //local variable 
		System.out.println("value of a is from instance method : "+a);
		} 
	public static void methodTwo() { //static method 
		int b=40;//local variable 
		System.out.println("value of b from static method : "+b); 
		} //main method 
	public static void main(String[] args) {
		//syntax: ClassName referenceVariable= new ClassName(); 
		ExampleOnVariables ev=new ExampleOnVariables(); //accessing the instance variables using object 
		System.out.println("employeeId is : "+ev.empId); 
		System.out.println("employeeName is : "+ev.empName); 
		System.out.println("employeeSalary is : "+ev.salary); //accessing static variable direclty in another static method 
		System.out.println("pi values is : "+pi); //accessing static variable using ClassName.
		System.out.println("pi value is : "+ExampleOnVariables.pi); //instanc emethod we can access in static method usign object
		ev.methodOne(); //calling static method using ClassName 
		methodTwo(); 
	}
	}
