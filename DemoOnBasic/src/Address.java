public class Address {
	String state; 
	String city; 
	String country; 
	
	//constructor whose name is same has class name 
	//constructor is used to initialize an object 
	//constructor does not have any return type not even void. 
	//this keyword used to differentiate local and instance variables 
	
	public Address(){ 	//default constructor 
		this.city=null; 
		this.state=null; 
		this.country=null; 
	}
	
	public Address(String city,String state,String cn){	//parameter-constructor 
		this.city=city;
		this.state=state;
		country=cn; 
	}
}