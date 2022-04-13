import java.util.Arrays;

public class exam {

	public static void main(String[] args) {
		int result=1;
		Arrays.stream(new int[] {1,2,3}).map(i->{
			int result2=1;
			System.out.println("doubling" + i++);
			result2*=i;
			return result2;
		});
		System.out.println(result);

	}

}
