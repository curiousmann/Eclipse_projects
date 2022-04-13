public class Test {
	public static void main(String[] args) { 
		Employee e= new Employee(); 
		//initialze 
		/* is not supposible directy we can initialize with help of setter methods 
		 * e.empId=100; e.empName="smith"; e.sal=3000; 
		 */ 
		
		e.setEmpId(1001); 
		e.setEmpName("Smith"); 
		e.setSal(3000); 
		
		System.out.println("Employee Details are :"); 
		System.out.println("employeeId is : "+e.getEmpId());
		System.out.println("employeeName is :"+e.getEmpName()); 
		System.out.println("employeeSal is : "+e.getSal()); 
	}
}