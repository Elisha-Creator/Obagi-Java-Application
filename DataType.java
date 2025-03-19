public class DataType{
	public static void main(String[] args){
		//Integer type (byte,short,int,long)
		byte age = 50;
		System.out.printf("You are %d years old%n",age);
		
		short quantity = 20000;
		System.out.printf("i bought %d quantity of bags for my buisness%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The world population is %d%n",worldPopulation);
		
		//float-point numbers(float, double)
		float weight =5.6F;
		System.out.printf("The bad of rice was %.1fkg%n",weight);
		
		double acctBalance = 487575.94747;
		System.out.printf("Your account balance is %c%.2f %n",'$',acctBalance);
		
		//Boolean type(boolean)
		boolean isJavaFun = true;
		System.out.printf("Is java fun? %b%n",isJavaFun);
		
		//Character type
		char alpha = '@';
		System.out.printf("My email is oluwafemiarogundade59%cgamil.com",alpha);
	}
} 