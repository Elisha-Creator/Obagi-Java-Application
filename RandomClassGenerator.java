import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java %b%n",option);	
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The random number is %d%n",integerWithNoBound);
		
		int integerWithBound = random.nextInt(2000) + 1;
		System.out.printf("The random number is %d%n",integerWithBound);
		
		long integer = random.nextLong();
		System.out.printf("The random number is %d%n",integer);
		
		float number = random.nextFloat();
		System.out.printf("The random number is %f%n",number);
		
		double num = random.nextDouble();
		System.out.printf("The random num is %.2f%n",num);
   }
}