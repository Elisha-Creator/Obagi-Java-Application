import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate the perimeter of different shapes");
		System.out.println("Enter 1 To calculate perimeter of A Square");
		System.out.println("Enter 2 To calculate perimeter of A Rectangle");
		System.out.println("Enter 3 To calculate perimeter of A Circle");
		System.out.println();
		
		System.out.printf("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the lenght of the square: ");
				int lenghtOfSqaure = input.nextInt();
				
				MethodOverLoading.shape(lenghtOfSqaure);
			}
			break;
			
			case 2:
			{
				
				System.out.print("Enter the lenght of the Rectangle : ");
				int lenghtOfRectangle = input.nextInt();
				
				System.out.print("Enter the breadth of the Rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(lenghtOfRectangle,breadthOfRectangle);
			}
			break;
			
			case 3:
			{
				
				System.out.print("Enter the radius of the Circle: ");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			default:
			System.out.println("Invalid input");
		}
	}
	
	public static void shape(int lenght){
		int perimeterOfSquare = 4 * lenght;
		
		System.out.printf("The perimeter of a sqaure is %d%n", perimeterOfSquare);
	}
	
	public static void shape(int lenght, int breadth){
		int perimeterOfRectangle = 2 *(lenght + breadth);
		
		System.out.printf("The perimeter of Rectangle is %d%n", perimeterOfRectangle);
	}
	
	public static void shape(double radius){
		double perimeterOfCircle = 2* Math.PI * radius;
		
		System.out.printf("The perimeter of Circle is %f%n", perimeterOfCircle);
	}
}