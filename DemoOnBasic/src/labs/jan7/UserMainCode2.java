package labs.jan7;

public class UserMainCode2 {
	public static int validateNumber (String number){
		return number.matches("\\d\\d\\d\\D\\d\\d\\d\\D\\d\\d\\d\\d")?1:-1;
	}
}
