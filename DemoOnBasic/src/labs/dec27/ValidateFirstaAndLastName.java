package labs.dec27;
import java.util.Scanner;
public class ValidateFirstaAndLastName {

	public static void main(String[] args) throws MyException{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		String firstName=sc.nextLine();
		System.out.println("enter the last name");
		String lastName=sc.nextLine();
		sc.close();
		if(firstName.isEmpty())
			throw new MyException("Invalied First Name");
		else if(lastName.isEmpty())
			throw new MyException("Invalied last Name");
		else
			System.out.println(firstName+" "+lastName);
	}

}
