package labs.jan7;

public class UserMainCode5 {
	 public static int checkCharacters(String input) {
		return input.endsWith(input.substring(0, 1))?1:-1;
	 }
}
