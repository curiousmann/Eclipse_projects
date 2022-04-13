package assignments.jan7;
import java.util.Random;
public class ExampleOnRandom {
    public static void main(String[] args)	{
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextGaussian());
    }
}
