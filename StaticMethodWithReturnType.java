public class StaticMethodWithReturnType{
	public static void main(String[] arge){
		double result = StaticMethodWithReturnType.average(70,90,50);
		System.out.printf("The average is %f",result);
	}
	public static double average(int num1, int num2, int num3){
		
		double avg = (double)(num1 + num2 + num3)/3;
		
		return avg;
	}
}