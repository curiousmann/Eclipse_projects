public class Student {
	int sid;
	String sname;
	Address a;	//student has a relation with Address Class 
	
	public Student(){
		this.sid=0;
		this.sname=null;
		this.a=null;
		
	} 
	
	public Student(int sid,String sname,Address a)	{
		this.sid=sid;
		this.sname=sname; 
		this.a=a; 
		
	} 
	
	public static void main(String[] args) {
		Address a1 = new Address("hyd","telangana","india");
		Student s= new Student(1001,"Martin",a1); 
		System.out.println("Student Details"); 
		System.out.println("Sid is :"+s.sid); 
		System.out.println("Stundent name is :"+s.sname); 
		System.out.println("city :"+s.a.city); 
		System.out.println("state "+s.a.state); 
		System.out.println("country :"+s.a.country);
	}
	
}